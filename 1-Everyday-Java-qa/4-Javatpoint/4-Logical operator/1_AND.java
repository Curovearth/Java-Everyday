//Logical && and Bitwise &

class Opnew{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a<b && a<c);// 10<5 && 10<20   //doesn't look at the next condition if the first condition is false
        System.out.println(a<b & a<c);//  10<5 & 10<20  //Looks for both condition to be true then only prints true

        System.out.println(a>b & a<c);//  10>5 & 10<20  true & true -> returns true
        System.out.println(a>b & a>c);//  10>5 & 10>20  true & false -> returns false
        System.out.println(a>b && a<c);//  10>5 && 10<20  true && true -> returns true
        System.out.println(a>b && a>c);//  10>5 && 10>20  true && false -> returns false
        System.out.println(a<b && a>c);//  10<5 && 10>20  false(first condition) -> returns false

    }
}