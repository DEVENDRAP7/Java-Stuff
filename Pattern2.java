import java.util.*;
class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of your choice :");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
        }
        sc.close();
    }
}