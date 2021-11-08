public class palindrome_1 {
    public static void main(String args[]){
        int r,sum=0,temp;
        int n=454;
        temp=n;
        //Finding the reverse of n
        while(n>0){
            r=n%10;             //Finding the remainder
            sum=(sum*10)+r;     
            n=n/10;
        }
        if (temp==sum){
            System.out.print(temp+" is a palindrome number.");
        }else{
            System.out.print(temp+" isn't a palindrome number.");
        }
    }
}
