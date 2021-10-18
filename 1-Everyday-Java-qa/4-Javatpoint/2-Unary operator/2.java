//Dealing with the unary operator ~ and !

class Op2{
    public static void main(String args[]){
        int a=10;
        int b=10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a); //(minus of total +ve value starting from 0 with the number )
        System.out.println(~b); // 0-10 there a are 11 numbers so -11
        System.out.println(!c); //negate the bool value i.e, True->false and false->true
        System.out.println(!d);
    }
}