<<<<<<< HEAD
import java.util.*;

public class palindrome_2 {
    public static void main(String args[]){
        String original, reverse="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome number: ");
        original = in.nextLine();                           //taking in the input string from the user.
        int length = original.length();                     //finding the length of the string
        for(int i=length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);         //reversing the string
        }
        if(original.equals(reverse)) System.out.println("Entered string is palindrome");
        else System.out.println("Entered string is not a palindrome");
    }
}
=======
import java.util.*;

public class palindrome_2 {
    public static void main(String args[]){
        String original, reverse="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome number: ");
        original = in.nextLine();                           //taking in the input string from the user.
        int length = original.length();                     //finding the length of the string
        for(int i=length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);         //reversing the string
        }
        if(original.equals(reverse)) System.out.println("Entered string is palindrome");
        else System.out.println("Entered string is not a palindrome");
    }
}
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
