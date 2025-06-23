public class DuplicateTF {
    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 9, 1, 4, 6, 2, 8};
        int n = arr.length;
        boolean hasDuplicate = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }
        System.out.println("Array has duplicates: " + hasDuplicate);
        }
}