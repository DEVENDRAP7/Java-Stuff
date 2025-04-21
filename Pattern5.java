import java.util.*;
public class Pattern5
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int c;
        System.out.println("Enter any number :");
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        boolean found = false;
        for(a=1;a<=100;a++)
        {
            for(b=1;b<=100;b++)
            {
                if(a+(a*b)+b == c && a!=10 && b!=10)
                {
                    System.out.println("A = "+a+" B = "+b);
                    System.out.println("a + ( a * b ) + b = "+c);
                    found = true;
                }
            }
        }      
        if(!found)
        {
            System.out.println("No solution found !!!");
        }
    }
}