//Dealing with unary operator ++ and --

class OperatorEx{
    public static void main(String args[]) {
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        System.out.println(x++ + ++x);
    }
}
