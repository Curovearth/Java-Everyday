import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
            
        }
        
        sc.close();
    }
}
//It is a Scanner class method which returns true if this scanner has another token in its input. This method may block while waiting for input to scan.
