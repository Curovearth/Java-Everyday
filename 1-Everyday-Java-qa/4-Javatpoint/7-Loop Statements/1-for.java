/*So you might be knowing how the for loop works 
given that for(initiation; condition; increment/decrement) */

class Calculation{
    public static void main(String[] args){
        int sum=0;
        for(int j=1; j<=10; j++){
            sum+=j;
        }
        System.out.println("Sum of first 10 natural numbers is "+sum);
    }
}
// sum of natural numbers n*(n+1)/2