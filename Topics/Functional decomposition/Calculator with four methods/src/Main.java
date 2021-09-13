import java.util.Scanner;

class SimpleCalculator {
    // Implement your methods here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String kind = scanner.next();
        long b = scanner.nextLong();

        switch (kind) {
            case "-":
                subtractTwoNumbers(a, b);
                break;
            case "+":
                sumTwoNumbers(a, b);
                break;
            case "/":
                divideTwoNumbers(a, b);
                break;
            case "*":
                multiplyTwoNumbers(a, b);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void subtractTwoNumbers(long a, long b) {
        long result = a - b;
        System.out.println(result);
    }

    public static void sumTwoNumbers(long a, long b) {
        long result = a + b;
        System.out.println(result);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            long result = a / b;
            System.out.println(result);
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        long result = a * b;
        System.out.println(result);
    }
}