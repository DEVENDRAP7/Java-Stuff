import java.util.*;
import java.util.HashSet;

public class ArrHashSet {
    public static void main(String[] args) {
        // Create an array of integers
        int arr[] = {3,7, 5, 9, 1, 4, 6, 2, 8};
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements to the HashSet
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("HashSet contains: " + set);
    }
}