//Dealing with Logical OR operators
class OperatorEx{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b || a<c );    //true(first condition) -> returns true
        System.out.println(a<b || a<c );    //false || true -> returns true
        System.out.println(a>b | a>c );     //true | false -> true
        System.out.println(a<b | a>c );     //false | false -> false
        System.out.println(a>b | a<c );     //true | true -> true
    }
}