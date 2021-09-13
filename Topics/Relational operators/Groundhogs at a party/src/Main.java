import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean partyWeekend = weekend && cups >= 15 && cups <= 25;
        boolean partyWeek = !weekend && cups >= 10 && cups <= 20;

        System.out.println(partyWeek || partyWeekend);
        // put your code here
    }
}