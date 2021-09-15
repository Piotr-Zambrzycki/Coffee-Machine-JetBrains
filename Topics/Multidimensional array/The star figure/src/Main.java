import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int halfSize = size / 2;
        String[][] matrix = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == halfSize || i == halfSize || size - 1 - i == j) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }

        for (String[] strings : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(strings[j]);
                if (j < matrix.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}