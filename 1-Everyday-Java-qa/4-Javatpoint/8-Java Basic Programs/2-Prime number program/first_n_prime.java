// Calculation of first n prime numbers 

public class first_n_prime {
    public static void main(String args[]) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int val=2;val<=i;val++){
                boolean flag=false;
                for(int y=2;y<=val/2;y++){
                    if(val%y==0){
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                    System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}