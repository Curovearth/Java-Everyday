// Using equals() method

public class comparison_equals {
    public static void main(String args[]){
        Double x = new Double(123.4555);       // creating constructor of the double class
        Long y = new Long(9887544);             // creating constructor of the long class
        System.out.println("Objects are not equal, hence it returns "+x.equals(y));
        System.out.println("Objects are equal, hence it returns "+x.equals(123.4555));
    }
}

// Output is 
/*
Objects are not equal, hence it returns false
Objects are equal, hence it returns true
*/