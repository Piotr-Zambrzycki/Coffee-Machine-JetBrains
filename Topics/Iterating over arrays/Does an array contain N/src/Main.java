import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }

        int var = scanner.nextInt();
        boolean check = false;

        for (int i : array) {
            if (i == var) {
                check = true;
                break;
            }
        }

        System.out.println(check);


    }
}