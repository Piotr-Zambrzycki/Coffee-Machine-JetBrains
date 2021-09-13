import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];



        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int temp = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > temp) {
                temp = array[i];
                max = i;
            }
        }

        System.out.println(max);
    }
}