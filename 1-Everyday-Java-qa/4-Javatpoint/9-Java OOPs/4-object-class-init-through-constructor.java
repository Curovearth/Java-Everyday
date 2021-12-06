class TestEmployee {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.id = 6373877;
        e2.id = 6273827;
        e3.id = 6929197;
        e1.name = "Stef";
        e2.name = "Riana";
        e3.name = "Arica";
        e1.salary = 3999;
        e2.salary = 5699;
        e3.salary = 4599;

        e1.displayInformation();
        e2.displayInformation();
        e3.displayInformation();
    }
}

class Employee {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }
    void displayInformation() {
        System.out.println(id + " " + name + " " + salary);
    }
}

