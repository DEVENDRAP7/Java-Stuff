import java.util.HashSet;

public class HashsetPrac {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // Duplicate, will not be added
        System.out.println(set);
    }
}
