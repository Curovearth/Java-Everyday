<<<<<<< HEAD
import java.util.Scanner;

public class reverse_using_recursion {
    static int reverse(int n) {
        // int rem = 0, rev = 0;
        if (n<10){
            System.out.println(n);
            return n;
        }else{
            
            System.out.print(n%10);
            return reverse(n/10);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int num = sc.nextInt();

        reverse(num);
    }
}
=======
import java.util.Scanner;

public class reverse_using_recursion {
    static int reverse(int n) {
        // int rem = 0, rev = 0;
        if (n<10){
            System.out.println(n);
            return n;
        }else{
            
            System.out.print(n%10);
            return reverse(n/10);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int num = sc.nextInt();

        reverse(num);
    }
}
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
