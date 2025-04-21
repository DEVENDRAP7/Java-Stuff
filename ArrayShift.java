import java.util.Scanner;

public class ArrayShift 
    {
        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Enter the shift amount: ");
            int shiftAmount = scanner.nextInt();
            int n = arr.length;
            int k=1;
            if (shiftAmount < 0) 
            {
                k = n + (shiftAmount % n);
            } 
            else 
            {
                k = shiftAmount % n;
            }
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) 
            {
                temp[(i + k) % n] = arr[i];
            }
            for (int i = 0; i < n; i++) 
            {
                arr[i] = temp[i];
            }
            System.out.println("Rotated array:");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            scanner.close();
    }
}