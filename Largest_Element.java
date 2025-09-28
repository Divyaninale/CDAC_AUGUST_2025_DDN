public class Largest_Element
{
    public static int LargeElement(int arr[],int len)
    {
        int max=arr[0];
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max)
            {
               max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,33,6,2};
        int result=LargeElement(arr,arr.length);
        System.out.println("Largest Element is:"+result);
    
    }
}