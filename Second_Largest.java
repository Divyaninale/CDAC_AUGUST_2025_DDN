public class Second_Largest
{
    public static int secondlarge(int arr[], int len)
    {
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++)
        {
            if (arr[i] > large)
            {
                seclarge = large;  // update second largest first
                large = arr[i];    // then update largest
            }
            else if (arr[i] > seclarge && arr[i] != large)
            {
                seclarge = arr[i];
            }
        }

        return seclarge;
    }

    public static void main(String args[])
    {
        int arr[] = {2, 6, 3, 8, 5};
        int result = secondlarge(arr, arr.length);

        if (result == Integer.MIN_VALUE)
            System.out.println("No second largest element found.");
        else
            System.out.println("Second Largest: " + result);
    }
}
