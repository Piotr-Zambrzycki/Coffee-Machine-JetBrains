import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        char x1 = number.charAt(0);
        char x2 = number.charAt(1);
        char x3 = number.charAt(2);
        char x4 = number.charAt(3);

        if (x1 == x4 && x2 == x3) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}