/*
You are provided an array A of size N that contains non-negative integers. 
Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 10.
*/

class Divisiblity
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt(); //taking the inputs as array
        }
        String s="";
        String s1;
        for(int i=0;i<n;i++)
        {
            s1=Integer.toString(arr[i]%10); //taking the last number of the array elements
            s = s + s1; //concatenating into one single string
        }
        int number=Integer.parseInt(s); //converting string to int
        if(number%10==0)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }
}
