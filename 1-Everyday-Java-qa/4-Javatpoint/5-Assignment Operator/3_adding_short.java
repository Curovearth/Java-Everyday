class OpSh{
    public static void main(String args[]){
        short a=10;
        short b=10;
        short c=5;
        short d=5;
        a=a+b;
        System.out.println(a); //Compile time error since 10+10=20 (int type)
        
        //TYPECASTING
        c=(short)(c+d); // prints out 10(int converted to short)
        System.out.println(c);
    }
}