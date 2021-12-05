<<<<<<< HEAD
import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = n.nextInt();
        for(int i=1;i<=row;i++){            // Determines the number of rows.
            for(int j=1;j<=i;j++){          // Determines the number of columns in each row.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* Output is 
Enter a number: 6
* 
* *
* * *
* * * *
* * * * *
* * * * * *
=======
import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = n.nextInt();
        for(int i=1;i<=row;i++){            // Determines the number of rows.
            for(int j=1;j<=i;j++){          // Determines the number of columns in each row.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* Output is 
Enter a number: 6
* 
* *
* * *
* * * *
* * * * *
* * * * * *
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
*/