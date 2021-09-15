import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixLevel = scanner.nextInt();
        int[][] matrix = new int[matrixLevel][matrixLevel];
        boolean symetric = true;


        for (int i = 0; i < matrixLevel; i++) {
            for (int j = 0; j < matrixLevel; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrixLevel; i++) {
            for (int j = 0; j < matrixLevel; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symetric = false;
                }
            }
        }

        if (symetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }





        // put your code here
    }
}