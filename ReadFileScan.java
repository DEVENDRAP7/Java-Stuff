import java.io.File;
import java.util.Scanner;
public class ReadFileScan
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("C:\\Users\\deven\\OneDrive\\Documents\\devendra\\NLJ\\java project\\text2.txt");
		file.createNewFile();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
		System.out.println(sc.nextLine());
		sc.close();
	}
}