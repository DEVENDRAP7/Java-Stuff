public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int arr[]={3,7,5,9,1,4,6,2,8};
        int n=arr.length;
        int i,j;
        for(i=1;i<n;i++)
        {
            System.out.println(arr[i]);
            j=i-1;
            int temp=arr[i];
            {
                while(j>=0 && temp<arr[j])
                {
                    arr[j+1]=arr[j];
                    j--;
                }
            }
            arr[j+1]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}