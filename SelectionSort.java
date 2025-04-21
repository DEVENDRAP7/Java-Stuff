public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int arr[]={3,7,5,9,1,4,6,2,8};
        int n=arr.length;
        int i,j,min;
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }  
    }
}
