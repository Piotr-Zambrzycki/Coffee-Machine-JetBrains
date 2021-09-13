

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean check1 = a >= b && a <= c;
        boolean check2 = a <= b && a >= c;

        System.out.println(check1 || check2);
        // put your code here
    }
}