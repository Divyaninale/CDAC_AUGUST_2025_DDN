public class String_C0mpression
{
    public static void main(String args[])
    {
        String str="aaaabbbcccd";
        int n=str.length();
        String newString=" ";

        for(int i=0;i<n;i++)
        {
            Integer count=1;

            while(i<n-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;

            }
            newString+=str.charAt(i);
            if(count>1)
            {
                newString+=count.toString;
            }

        }
        System.out.println("Compressed String:"+newString);
    }
}