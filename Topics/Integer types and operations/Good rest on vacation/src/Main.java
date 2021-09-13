import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodcost = scanner.nextInt();
        int flightcost = scanner.nextInt();
        int nightscost = scanner.nextInt();

        System.out.println(days * foodcost + 2 * flightcost + (days - 1) * nightscost);

    }
}