class addnumber {
    public static void main(String []args){
        int a = 2;
        int b = 3;
        int c = a+b;
        System.out.println(c);

        //Widening
        int d = 10;
        float f = d;
        System.out.println(d);
        System.out.println(f);

        //Typecasting
        float e = 10.5f;
        int g = (int)e;
        System.out.println(e);
        System.out.println(g);

        //Overflow
        int i = 130;
        byte h = (byte)i;
        System.out.println(h);
    }
}
