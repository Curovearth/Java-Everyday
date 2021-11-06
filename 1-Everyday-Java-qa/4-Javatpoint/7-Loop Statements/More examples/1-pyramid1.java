public class pyramid1 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){              // decides the number of rows
            for(int j=1;j<=i;j++){          // decides the number of columns and depends on the value of i(row)
                System.out.print("* ");
            }
            System.out.println();           // after the row iteration print on a new line
        }
    }
}
/*The output comes out as
* 
* *
* * *
* * * *
* * * * *
*/