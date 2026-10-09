public class CircleArea {
    double radius = 25.90;

    void calculateArea() {
        double area = Math.PI * radius * radius;

        System.out.println("Area :"+area);
    }
    public static void main(String[] args){
        CircleArea c = new CircleArea();

        c.calculateArea();
    }
}
