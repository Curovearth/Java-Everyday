public class prime_using_method {
    static void checkprime(int n){
        int m=0;
        if(n==0||n==1) {
            System.out.println("Not a prime number");
        }
        else{
            m=n/2;
            boolean flag=false;
            for(int i=2;i<=m;i++){
                
                if(n%i==0){             // for non prime number
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }

        }
        
    }
    public static void main(String args[]) {
        checkprime(10);
        checkprime(1);
        checkprime(3);
    }
}
