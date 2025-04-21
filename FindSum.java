import java.util.*;
//finds the number in array that is equal to the key 
class FindSum
{
    public static void main(String a[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a key");
        int key=sc.nextInt();
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr[i]);
            for(int j=i;j<arr.length;j++)
            {
               //System.out.println(arr[j]);
                if(arr[i]+arr[j]==key && arr[i]!=arr[j])
                {
                    System.out.println(arr[i]+" + " +arr[j]+" = " +key);
                }
            }
        }
    }
}