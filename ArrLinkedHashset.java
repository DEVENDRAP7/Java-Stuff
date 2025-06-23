import java.util.LinkedHashSet;

public class ArrLinkedHashset {
    public static void main(String[] args) {
        // Create an array of integers
        int arr[] = {6,1,2,1,2,3,4,8};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("LinkedHashSet contains: " + set);
    }
}
