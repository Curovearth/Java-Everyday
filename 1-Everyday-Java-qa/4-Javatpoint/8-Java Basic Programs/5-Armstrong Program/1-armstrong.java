import java.util.*;

public class armstrong {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int temp=number;
        int len = String.valueOf(number).length();
        // System.out.println(len);
        double rem=0,sum=0;
        while(temp>0){
            rem=temp%10;
            // System.out.println(rem);
            sum = Math.pow(rem,len)+sum;
            // System.out.println(sum);
            temp=temp/10;
        }
        
        if(number==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
