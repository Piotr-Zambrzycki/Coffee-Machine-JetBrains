import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i < b + 1; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
        // put your code here
    }
}