import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int a;
        int b;
        int c;

        double pow;

        switch (type) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double half = (double) (a + b + c) / 2;
                pow = Math.sqrt(half * (half - a) * (half - b) * (half - c));
                System.out.println(pow);
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                pow = a * b;
                System.out.println(pow);
                break;
            case "circle":
                int r = scanner.nextInt();
                pow = 3.14 * r * r;
                System.out.println(pow);
                break;
            default:
                System.out.println("error!");
                break;
        }
        // put your code here
    }
}