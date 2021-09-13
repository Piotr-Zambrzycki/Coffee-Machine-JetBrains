import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean x1 = a > 0 && b <= 0 && c <= 0;
        boolean x2 = a <= 0 && b > 0 && c <= 0;
        boolean x3 = a <= 0 && b <= 0 && c > 0;


        System.out.println(x1 || x2 || x3);
        // put your code here
    }
}