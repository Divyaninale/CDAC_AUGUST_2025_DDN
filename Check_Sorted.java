public class Check_Sorted
{
    public static boolean isSorted(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(n<=1)
            {
                return true;
            }
            if(arr[i+1]<arr[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        boolean result=isSorted(arr,arr.length);
        System.out.println(result);
    }
}