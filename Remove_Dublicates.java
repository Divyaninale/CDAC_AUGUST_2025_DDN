import java.util.*;
import java.util.HashSet;
public class Remove_Dublicates
{
    public static HashSet<Integer> remove(int arr[],int n)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        return set;

    }
    public static void main(String args[])
    {
        int arr[]={1,2,7,3,2,7,4,5,7};
        HashSet<Integer> result=remove(arr,arr.length);
        System.out.println("Array after removing dublicates:"+result);
        
    }
}