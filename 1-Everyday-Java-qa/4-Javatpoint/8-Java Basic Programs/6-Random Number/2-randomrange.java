// Generating random numbers between 200 and 400 using Math.random() function

import java.lang.Math;
public class randomrange {
    public static void main(String args[]){
        int min = 200;
        int max = 400;
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
    }
}
// Output observed is 254.75920492292127