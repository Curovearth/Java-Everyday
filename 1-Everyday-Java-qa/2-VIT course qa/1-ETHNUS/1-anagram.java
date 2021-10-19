import java.util.*;
import java.util.Arrays;

class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 string");
        String str1 = scan.nextLine();
        System.out.println("2 string");
        String str2 = scan.nextLine();
        
        str1 = str1.toUpperCase().trim();
        str2 = str2.toUpperCase().trim();
        System.out.println(str1);
        if(str1.length()==str2.length())
        {
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            String d1 = Arrays.toString(s1);
            String d2 = Arrays.toString(s2);
            if(d1.equals(d2))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println("No");
        }
    }
}