class Student3{
    int id;
    String name;
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]){
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();   // 0 null
        s2.display();   // 0 null
    }
}

// In the above class, you are not creating any constructor so compiler provides you a default constructor. 
// Here, 0 and null values are provided by default constructor.