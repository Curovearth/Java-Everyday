// Calculation of first n prime numbers 
import java.util.Scanner;

public class first_n_prime {
    public static void main(String args[]) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        int num=2;
        if(n>1){
            System.out.print("The first "+n+" prime numbers are: ");

            for(int i=1;i<=n;){
                boolean flag=false;
                for(int j=2;j<=Math.sqrt(num);j++){
                
                    if(num%j==0){           // For non prime numbers
                        flag=true;          // flag changes to true.
                        break;
                    } 
                }
                if(!flag){                  // for prime numbers flag remains false
                    System.out.print(num+" ");
                    i++;                    // and value of i gets increased by 1
                }
                num++;                      // after every iteration the value of num also increases
            }
        }else{
            System.out.println("Not valid");
        }
    }
}