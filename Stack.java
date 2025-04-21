import java.util.*;
public class Stack 
{
    public static void main(String[] args) 
    {
        int top=0;
        System.out.println("Enter size of stack ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]={size};
        int value;
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println("Enter value to be pushed");
            value=sc.nextInt();
            arr[i]=value;
            top=top+1;
        }
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    
}
