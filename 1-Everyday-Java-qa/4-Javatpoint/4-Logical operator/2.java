//JAVA AND OPERATOR
class ops{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<10);  // false
        System.out.println(a);              // 10    
        System.out.println(a>b && a++<c);   // 10>5 and 11<20 second condition is also checked and returns true
        System.out.println(a);              // 11
        System.out.println(a<b && a++<c);   //10<5 returns false

    }
}