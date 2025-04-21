import java.util.Scanner;
class Fibonacci
{ 
    public static void main(String args[]) 
    { 
        int n,n1=0,n2=1,n3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");        
        n=sc.nextInt();
        sc.close();
        for (int i=2;i<n;i++)
        {
            n3=n2+n1;
            System.out.println(n3);
            n1=n2;
            n2=n3;
         }
    } 
} 
