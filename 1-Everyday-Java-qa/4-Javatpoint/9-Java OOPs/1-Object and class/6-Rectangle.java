
class TestRectangleArea {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(), r2 = new Rectangle();
        r1.insert(12,13);    //r1.length = 12; r1.width = 13;
        r2.insert(10, 4);   //length = 10; r2.width = 4;
        r1.CalculateArea(); r2.CalculateArea();
    }
}

class Rectangle{
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
    }
    void CalculateArea(){
        System.out.println(length*width);
    }
}
