import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SimpleHttpServer {

    private static final int PORT = 8000;
    private static final String DB_URL = "jdbc:sqlite:test.db";

    public static void main(String[] args) throws IOException {
        createDatabase();
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server is listening on port " + PORT);
    }

    static void createDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String sql = "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, username TEXT, password TEXT, name TEXT)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String requestMethod = exchange.getRequestMethod();
            if (requestMethod.equalsIgnoreCase("GET")) {
                handleGetRequest(exchange);
            } else if (requestMethod.equalsIgnoreCase("POST")) {
                handlePostRequest(exchange);
            }
        }

        private void handleGetRequest(HttpExchange exchange) throws IOException {
            String response = "<html><body>"
                            + "<h1>Login</h1>"
                            + "<form method=\"post\" action=\"/login\">"
                            + "Username: <input type=\"text\" name=\"username\"><br>"
                            + "Password: <input type=\"password\" name=\"password\"><br>"
                            + "<input type=\"submit\" value=\"Login\">"
                            + "</form>"
                            + "</body></html>";
            sendResponse(exchange, response);
        }

        private void handlePostRequest(HttpExchange exchange) throws IOException {
            Map<String, String> params = parseFormData(exchange);
            String username = params.get("username");
            String password = params.get("password");
            
            if (isValidLogin(username, password)) {
                String name = getNameByUsername(username);
                String response = "<html><body>"
                                + "<h1>Welcome, " + name + "!</h1>"
                                + "</body></html>";
                sendResponse(exchange, response);
            } else {
                String response = "<html><body>"
                                + "<h1>Login Failed. Please try again.</h1>"
                                + "</body></html>";
                sendResponse(exchange, response);
            }
        }

        private boolean isValidLogin(String username, String password) {
            try (Connection conn = DriverManager.getConnection(DB_URL)) {
                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();
                return rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }

        private String getNameByUsername(String username) {
            try (Connection conn = DriverManager.getConnection(DB_URL)) {
                String sql = "SELECT name FROM users WHERE username = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return rs.getString("name");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return "Unknown";
        }

        private Map<String, String> parseFormData(HttpExchange exchange) throws IOException {
            Map<String, String> params = new HashMap<>();
            String requestBody = new String(exchange.getRequestBody().readAllBytes());
            String[] pairs = requestBody.split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    String key = keyValue[0];
                    String value = keyValue[1];
                    params.put(key, value);
                }
            }
            return params;
        }

        private void sendResponse(HttpExchange exchange, String response) throws IOException {
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}