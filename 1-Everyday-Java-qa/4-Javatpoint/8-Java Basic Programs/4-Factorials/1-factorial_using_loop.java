public class factorial_using_loop {
    public static void main(String args[]) {
        int num=5;
        if(num>0){
            int mul=1;
            for(int i=num;i>=1;i--){
                mul = mul*i;
            }
            System.out.print("Factorial of "+num+" is "+mul);
        }else{
            System.out.print("Factorial is "+1);
        }
        
    }
}
