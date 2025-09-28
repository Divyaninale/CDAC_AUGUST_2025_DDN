public class Linear_Search
{
    public static int Lsearch(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
            

        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={10,4,30,77,3};
        int ind=Lsearch(arr,arr.length,7);
        if(ind>=0)
        {
            System.out.println("Key found at:"+ind);

        }
        else
        {
            System.out.println("No key found");
        }

    }
}