public class Reverse_String
{
    public static void main(String args[])
    {
        String str="Divyani";
        StringBuilder sb=new StringBuilder("");

        int n=str.length();

        for(int i=n-1;i>=0;i--)
        {
            sb.append(str.charAt(i));

            
        }
        System.out.println(sb.toString());

    }
}