public class SwitchEnum {
    public enum Day{ Sun, Mon, Tue, Wed, Thu, Fri, Sat }    //constants placed inside curly brackets.
    public static void main(String[] args){
        Day[] DayNow=Day.values();              // bringing the constants which are the values inside the keyword enum
        for(Day Now:DayNow){                    // 'Now' hovers over all the values stored inside DayNow list.
            switch(Now){
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
// result obtained is printing of all the days due to the fact that we are using for loop and 'Now' hovers over all the values present.