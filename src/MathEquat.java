public class MathEquat {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int x;
        x = -b / a;

        if (a + b > 0) {
            System.out.println("x= " + x);
        } else if (a + b < 0){
            x = b/a;
            System.out.println("x: " + x);
        } else if (a +b ==0 || a -b ==0) {
            System.out.println("Result: x = 0");
        }
    }
}
