class Pattern1
/* op: 12345
 *     1234
 *     123
 *     12
 *     1
 */
{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
        }
        
    }
}