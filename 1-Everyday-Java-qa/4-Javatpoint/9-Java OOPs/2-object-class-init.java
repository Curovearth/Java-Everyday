class TestStudent{
    public static void main(String args[]){
        Student s1 = new Student(); //new object
        Student s2 = new Student(); //new object

        //Initialising the objects
        s1.id = 21;
        s2.id = 32;
        s1.name = "Roma";
        s2.name = "Percy";

        //Printing the data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

class Student{
    int id;
    String name;
}

