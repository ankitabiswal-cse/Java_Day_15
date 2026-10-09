public class RectangleArea {
    int length = 12;
    int breadth = 5;

    void calculateArea() {
        System.out.println("Area :"+(length * breadth));
    }
    public static void main(String[] args){
        RectangleArea r = new RectangleArea();

        r.calculateArea();

    }
}
