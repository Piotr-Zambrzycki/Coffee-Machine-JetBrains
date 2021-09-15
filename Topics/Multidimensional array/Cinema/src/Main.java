import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] cinema = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }

        }

        int k = scanner.nextInt();
        int counter;
        int row = 0;

        for (int i = 0; i < n; i++) {
            counter = 0;
            for (int j = 0; j < m; j++) {
                if (cinema[i][j] == 0) {
                    counter++;
                    if (counter == k) {
                        row = i + 1;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }

            if (counter == k) {
                break;
            }

        }

        System.out.println(row);
    }
}