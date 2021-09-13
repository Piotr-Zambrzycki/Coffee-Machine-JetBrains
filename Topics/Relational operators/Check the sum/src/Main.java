import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean a = number1 + number2 == 20 || number2 + number3 == 20 || number1 + number3 == 20;

        System.out.println(a);

        // put your code here
    }
}