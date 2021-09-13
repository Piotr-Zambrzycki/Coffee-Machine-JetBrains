import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        for (int i = 1; i < 100; i++) {
            if (i * day - (i - 1) * night >= height) {
                System.out.println(i);
                break;
            }
        }
    }
}
