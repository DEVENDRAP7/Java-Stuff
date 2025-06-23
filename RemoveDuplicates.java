import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 5, 1, 3, 6};
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet to remove duplicates and maintain order
        for (int num : arr) {
            uniqueElements.add(num);
        }
        
        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
    }
}
