public class ShellSort 
{
    public static void main(String[] args) 
    {
        int arr[]={3,7,5,9,1,4,6,2,8};
        int n=arr.length;
        int i,j,gap;
        for(gap=n/2;gap>0;gap/=2)
        {
            for(j=gap;j<n;j++)
            {
                int temp = arr[j];
                for(i=j-gap;i>=0 && arr[i]>temp;i-=gap)
                {
                    arr[i+gap] = arr[i];
                }
                arr[i+gap] = temp;
            }
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }        
    }   
}