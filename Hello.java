import java.util.Scanner;
public class Hello 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter total prime numbers that you want to print");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int count=1;
        boolean flag=true;
        System.out.println("prime numbers\n");
        for(int i = 2; count <=N; i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                } 
            }
            if(flag)
            {
                System.out.println(i);
                count++;
            }
        } 
    } 
}