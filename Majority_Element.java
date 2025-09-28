import java.util.*;
public class Majority_Element
{
    public static void main(String args[])
    {
        int arr[]={1,4,2,7,4,9,2,4,6,2,8,8,8,8,8,8};
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
               map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer>keys=map.keySet();

        for(int i:keys)
        {
            if(map.get(i)>5)
            {
                System.out.println(i+" ");
            }
        }

    }
}