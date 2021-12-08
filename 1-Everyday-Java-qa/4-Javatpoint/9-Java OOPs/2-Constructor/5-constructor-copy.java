class Student6{
    int id;
    String name;
    Student6(int i, String n){
        id = i;
        name = n;
    }
    Student6(Student6 s){   // Constructor to copy the contents of the previous constructor
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]){
        Student6 s1 = new Student6(34, "Leo");
        Student6 s2 = new Student6(s1);
        s1.display();
        s2.display();
    }
}