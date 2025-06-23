import java.util.Arrays;
import java.util.Scanner;

public class NumberOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 0;
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count++;
        }
        System.out.println("Number of elements: " + count);
    }   
}