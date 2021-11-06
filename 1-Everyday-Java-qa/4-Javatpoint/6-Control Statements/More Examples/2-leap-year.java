// Leap Year example
// Leap years are divisible by 4 and 400 but not by 100
public class leap{
    public static void main(String args[]){
        int n=2000; //assigning the year
        
        //Here we determine that the year should be divisible by any 4 or 400 and checks with && 100 for year to be a leap year.
        if((n%4==0)||(n%400==0)&(n%100!=0)){
            System.out.println(n+" is a leap year");
        }else{
            System.out.println(n+" is not a leap year");
        }
    }
}
