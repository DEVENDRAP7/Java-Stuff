import java.util.*;
public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        while(num>10)
        {
            int a=num%10;
            int b=num/10;
            num=a+b;
            System.out.println(num);
        }
        sc.close();
    }   
}
