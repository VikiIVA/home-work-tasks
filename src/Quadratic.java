import com.sun.deploy.security.SelectableSecurityManager;

public class Quadratic {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 2;
        int x = -c / b;
        double x1;
        double x2;
        int d;
        d = (b * b) - (4 * a * c);

        if (a==0) {
            System.out.println("x1= " + 0);
            System.out.println("x2= " + x);
        }
        else if (d < 0) {
            System.out.println("No resolution");
        }
        else if (d ==0) {
            x1 = (-b) / (2*a);
            System.out.println("x1 = x2 = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
             System.out.println("x1= " +x1 + "x2= " + x2);
        }
    }
}
