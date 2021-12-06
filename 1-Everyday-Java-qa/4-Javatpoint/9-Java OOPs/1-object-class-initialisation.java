class TestStudent{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.id = 121;
        s1.name = "Jerusalema";
        System.out.println("id is " + s1.id + " and student name is " + s1.name);
    }
}

class Student{
    int id;
    String name;
}
