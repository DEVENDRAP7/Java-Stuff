import java.util.Arrays; 
public class MergeSort 
{
   public static void mergeSort(int[] array) {
      if (array.length < 2) {
         return; // Base case: array is already sorted
      }
      int mid = array.length / 2;
      int[] left = new int[mid];
      int[] right = new int[array.length - mid];

      // Copy data to temporary arrays
      for (int i = 0; i < mid; i++) {
         left[i] = array[i];
      }
      for (int i = mid; i < array.length; i++) {
         right[i - mid] = array[i];
      }

      // Recursively sort the two halves
      mergeSort(left);
      mergeSort(right);

      // Merge the sorted halves
      merge(array, left, right);

   }

   // Method to merge two sorted arrays into a single sorted array
   private static void merge(int[] array, int[] left, int[] right) {
      int i = 0, j = 0, k = 0;

      // Merge elements from left and right arrays
      while (i < left.length && j < right.length) {
         if (left[i] <= right[j]) {
            array[k++] = left[i++];
         } else {
            array[k++] = right[j++];
         }
      }

      // Copy remaining elements from left array
      while (i < left.length) {
         array[k++] = left[i++];
      }

      // Copy remaining elements from right array
      while (j < right.length) {
         array[k++] = right[j++];
      }
   }
   public static void main(String[] args) {
    int[] array={5, 2, 9, 1, 5, 6};
    System.out.println("Original array: " + Arrays.toString(array));
    mergeSort(array);
    System.out.println("Sorted array: " + Arrays.toString(array));
   }
}