// To check if the number is prime which is provided by the user.

import java.util.Scanner;

public class prime_user_input {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();                      // user to provide a number assigned to 'n'
        // to check for prime using method 'isPrime'
        if(isPrime(n)){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not a prime number.");
        }
    }
    // dealing with 'boolean isPrime'
    static boolean isPrime(int n){
        if(n<=1) {return false;}            // we know that 1 and less than 1 doesn't count as prime
        for(int i=2;i<Math.sqrt(n);i++){    // for loop begins with 2 and goes uptill sqrt(n)
            if(n%i==0) return false;        // if the remainder is 0 it's a non prime number
        }
        return true;                        // return true when it doesn't follow the above cases.
    }
}
