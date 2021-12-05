/*Switch statements contains multiple blocks of code called cases.
It basically enhances the readability of the program.*/ 
//The following looks for the integer in the cases and when the number matches with a particular case it breaks from the statement.
class Stud implements Cloneable{
    public static void main(String[] args){
        int num=2;
        switch(num){
            case 0:
            System.out.println("number is 0");
            break;
            case 1:
            System.out.println("number is 1");
            break;
            default:
            System.out.println(num);
        }
    }
}