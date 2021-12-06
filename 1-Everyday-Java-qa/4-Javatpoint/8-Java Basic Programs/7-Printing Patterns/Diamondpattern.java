<<<<<<< HEAD
import java.util.Scanner;
public class DiamondPattern{
    public static void main(String args[]){
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j<= row; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/* Output is 
Enter the number of rows you want to print: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
=======
import java.util.Scanner;
public class DiamondPattern{
    public static void main(String args[]){
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j<= row; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/* Output is 
Enter the number of rows you want to print: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
*/