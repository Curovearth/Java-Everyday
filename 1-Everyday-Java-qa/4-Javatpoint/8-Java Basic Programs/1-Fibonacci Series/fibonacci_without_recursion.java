public class fibonacci_recursion {
    public static void main(String[] args){
        int a=1;
        int b=1;
        int c;
        int count=10;
        System.out.print(a+" "+b);          // Printing in the same line with gaps in between
        for(int i=2;i<count;i++){
            c = a+b;                        // Since fibonacci is sum of the preceding numbers which we have already define i.e. a=1 and b=1
            System.out.print(" "+c);        // print the sum
            a=b;                            // Now assign the update values
            b=c;
        }
    }
}
// Output is 1 1 2 3 5 8 13 21 34 55 