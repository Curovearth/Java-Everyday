import java.util.*;

class caltech
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a=0, b=1, c=0;
        for(int i=2;i<t;i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println("Size of amoeba is: " + c);
    }
}