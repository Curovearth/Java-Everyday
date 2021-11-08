//You are given a string. 
//Your task is to determine whether number of occurrences of some character in the string is equal to the 
//sum of the numbers of occurrences of other characters in the string.

import java.util.*;
class character 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<T;i++)
        {
            String s = scan.next();
            double len = s.length()/2;
            double len1 = s.length();
            int max = 0;
            while(s.length()!=0)
            {
                int count = s.length() - s.replace(s.charAt(0)+"","").length();
                max = Math.max(count,max);
                s = s.replace(s.charAt(0)+"","");
            }
            if(max==len&&(len1%2)==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
