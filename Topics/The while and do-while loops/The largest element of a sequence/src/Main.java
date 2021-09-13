import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int max = 0;
        do {
            a = scanner.nextInt();
            if (a > max) {
                max = a;
            }
        } while (a != 0);
        System.out.println(max);
        // put your code here
    }
}