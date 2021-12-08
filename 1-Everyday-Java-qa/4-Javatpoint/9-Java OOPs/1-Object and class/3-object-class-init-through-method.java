class TestStudent4{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(21, "Jaime");
        s2.insertRecord(13, "Arika");
        s1.displayInformation();
        s2.displayInformation();
    }
}

class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){     //Initialising a method to feed in the values
        rollno = r;
        name = n;
    }
    void displayInformation(){              //Another method for displaying the values
        System.out.println(rollno + " " + name);
    }
}