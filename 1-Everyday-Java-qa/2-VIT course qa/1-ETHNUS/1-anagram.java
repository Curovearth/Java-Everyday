//Question:
//Take two input strings from user (case-insensitive). Print "anagram" if an anagram else print "not an anagram"
//Following are the Constraints:
//Ignore white spaces in a string
//

import java.util.*;
import java.util.Arrays;

class Main
{
    public static void main(String[] args) 
    {
        //taking inputs from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("1 string");
        String str1 = scan.nextLine();
        System.out.println("2 string");
        String str2 = scan.nextLine();

        //converting strings to upper case characters so that we can compare them (you can also choose lower case)
        //also we're using "trim" function which will eliminate the white spaces
        str1 = str1.toUpperCase().trim();
        str2 = str2.toUpperCase().trim();
        System.out.println(str1);

        //we'll first compare the string length if the length of the string is not same then it is not an anagram, 
        //else it goes through different functions to check
        if(str1.length()==str2.length())
        {
            //we need to convert the string to character arrays so that java can compare the characters
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();
            //now we sort the characcter arrays alphabetically
            Arrays.sort(s1);
            Arrays.sort(s2);
            //now we need to convert the character array back to string (converted to string alphabetically)
            String d1 = Arrays.toString(s1);
            String d2 = Arrays.toString(s2);
            //now we check if the both the string are equal or not
            if(d1.equals(d2))
            {
                System.out.println("anagram");
            }
            else
            {
                System.out.println("not an anagram");
            }
        }
        else
        {
            System.out.println("not an anagram");
        }
    }
}