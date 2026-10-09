public class MethodParameter3 {
    static void checkNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        checkNumber(67);
    }
}
