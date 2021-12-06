public class Main
{
	public static void main(String[] args) {
	    int a = 34;
	    int b = 21;
	    int c = a++ + ++b;
        System.out.println(c);
		// //System.out.println("value of c: " + c); // c=54
        // int d = --a + --b + --c; //33 20 54
        // //System.out.println("value of d: " + d);
        // int e = a + +b + +c + d--; // 34 21 55 109
        // //System.out.println("value of e: " + e);
        // int f = -a + b-- + -c - d++;
        // //System.out.println("value of f: " + f);
        // int sum = a + b + c + d + e + f;
        // System.out.println("sum = " + sum);
	}
}
