public class fibonacci_with_recursion {
    static int a=1,b=1,c=0;                     // declaring variables for the class
    static void printFibonacci(int count){      // declaring the class
        if(count>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            printFibonacci(count-1);            // recursive nature
        }
    }
    public static void main(String args[]){     // main function
        int count=10;
        System.out.print(a+" "+b);
        printFibonacci(count-2);
    }
}
// output is 1 1 2 3 5 8 13 21 34 55