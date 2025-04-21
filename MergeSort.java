public class MergeSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 8, 1, 9};
        int mid=arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
    
        public static void mergeSort(int[] arr, int[] left, int[] right) 
        {
            int i = 0, j = 0, k = 0;
    
            while (i < left.length && j < right.length) 
            {
                if (left[i] <= right[j]) 
                {
                    arr[k++] = left[i++];
                } 
                else 
                {
                    arr[k++] = right[j++];
                }
            }
    
            while (i < left.length) 
            {
                arr[k++] = left[i++];
            }
    
            while (j < right.length) 
            {
                arr[k++] = right[j++];
            }
        System.out.println("Sorted array: ");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }
}