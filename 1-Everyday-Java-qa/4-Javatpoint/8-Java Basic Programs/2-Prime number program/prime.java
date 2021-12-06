<<<<<<< HEAD
// FINDING PRIME NUMBERS USING FOR LOOP
// The following program calculates prime numbers upto n or count
// This program doesn't calculate the first n prime numbers, So make sure!

public class prime {
    public static void main(String args[]){
        int count = 30;
        for(int val=1;val<=count;val++){            // val refers to the natural numbers uptill count
            boolean flag=false;
            if(val==1)continue;                     // we already know that 1 isn't a prime number
            else{
                for(int i=2;i<=val/2;i++){          // for natural numbers other than 1 the i goes till the half of the value
                    if(val%i==0){                   // the following 3 lines is for non prime number
                        flag=true;
                        break;
                    }
                }           
                if(!flag)                           // the following prints for a prime number.
                    System.out.print(val+" ");
            }
        }
    }
}
=======
// FINDING PRIME NUMBERS USING FOR LOOP
// The following program calculates prime numbers upto n or count
// This program doesn't calculate the first n prime numbers, So make sure!

public class prime {
    public static void main(String args[]){
        int count = 30;
        for(int val=1;val<=count;val++){            // val refers to the natural numbers uptill count
            boolean flag=false;
            if(val==1)continue;                     // we already know that 1 isn't a prime number
            else{
                for(int i=2;i<=val/2;i++){          // for natural numbers other than 1 the i goes till the half of the value
                    if(val%i==0){                   // the following 3 lines is for non prime number
                        flag=true;
                        break;
                    }
                }           
                if(!flag)                           // the following prints for a prime number.
                    System.out.print(val+" ");
            }
        }
    }
}
>>>>>>> cb9d92341e9ff39c69159e2c49b036eee628df7b
// Output is 2 3 5 7 11 13 17 19 23 29 