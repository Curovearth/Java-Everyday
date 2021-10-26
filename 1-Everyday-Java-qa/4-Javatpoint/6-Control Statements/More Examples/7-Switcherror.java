//Java switch statement where we are omitting the break statement and analyse how the result differs
public class main{
    public static void main(String[] args){
        int number=20;
        switch(number){
            case 10:
            System.out.println("10");   //looks for 20 found 10 doesn't print
            case 20:
            System.out.println("20");   //looks for 20 prints 20
            case 30:    
            System.out.println("30");   //prints 30
        }
    }
}
//all statements after first match gets printed.