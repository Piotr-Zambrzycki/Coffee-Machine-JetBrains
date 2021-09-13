import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chocoDim1 = scanner.nextInt();
        int chocoDim2 = scanner.nextInt();
        int segments = chocoDim1 * chocoDim2;
        int k = scanner.nextInt();

        ArrayList<Integer> options = new ArrayList<>();
        options.add(chocoDim1);
        options.add(chocoDim2);
        options.add(segments - chocoDim1);
        options.add(segments - chocoDim2);

        boolean check1 = k % chocoDim1 == 0 && k / chocoDim1 < chocoDim2;
        boolean check2 = k % chocoDim2 == 0 && k / chocoDim2 < chocoDim1;

        if (options.contains(k) || check1 || check2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // put your code here
    }
}