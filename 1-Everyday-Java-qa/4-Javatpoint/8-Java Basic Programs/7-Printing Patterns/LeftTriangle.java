import java.util.Scanner;
public class LeftTriangle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = s.nextInt();
        for(int i=1;i<=row;i++){                        //outer loop to work for rows
            for(int j=2*(row-i);j>=1;j--){              //inner loop to work for space
                System.out.print(" ");                  //prints space between 2 stars
            }
            for(int j=1;j<=i;j++){                      //inner loop for columns
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
*/
