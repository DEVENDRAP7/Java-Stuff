import java.util.Scanner;

public class MissingValue {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int expectedSum = num * (num + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("The missing number is: " + missing);      
    }
}