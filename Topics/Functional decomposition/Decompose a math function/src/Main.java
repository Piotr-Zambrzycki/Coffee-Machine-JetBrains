import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (x >= 1) {
            return f3(x);
        } else {
            return f2(x);
        }
        //call your implemented methods here.    
    }

    //implement your methods here
    public static double f1(double x) {
        return Math.pow(x, 2) + 1.0;
    }

    public static double f2(double x) {
        return 1.0 / Math.pow(x, 2);
    }

    public static double f3(double x) {
        return Math.pow(x, 2) - 1.0;
    }
}