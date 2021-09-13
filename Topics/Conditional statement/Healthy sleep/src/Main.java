import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep >= min && sleep <= max) {
            System.out.println("Normal");
        } else if (sleep > max) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
        // put your code here
    }
}