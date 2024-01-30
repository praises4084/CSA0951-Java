import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the string:");
        String s1=scanner.next();
        String s2="";
        int len=s1.length();
        for(int i=len-1 ;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
            System.out.print("Palindrome");
        else
            System.out.print("Not palindrome");
    }
}
