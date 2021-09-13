import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number1 = input / 100;
        int number2 = (input - number1 * 100) / 10;
        int number3 = input - number1 * 100 - number2 * 10;
        int reverse = number3 * 100 + number2 * 10 + number1;
        System.out.println(reverse);
        // put your code here
    }
}
