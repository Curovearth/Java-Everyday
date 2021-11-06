//Shift operator examples

class Left{
    public static void main(String[] args){
        //left shift operator is used to shift all the bits in the value
        // to the left side of a specified number of times
        System.out.println(10<<2);// 10*(2^2)
        System.out.println(15<<4);// 15*(2^4)
        System.out.println(10<<3);
        
        //Right shift operator
        System.out.println(10>>2);// 10/(2^2)
    }
}