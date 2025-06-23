import java.util.Scanner;

public class FIrstLastDIgit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first;
        int last = n%10;
        while(n>=10){
            n = n / 10;
        }
        first = n;
        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
    }
}