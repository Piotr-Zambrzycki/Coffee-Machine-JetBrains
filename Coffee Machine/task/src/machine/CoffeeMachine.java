package machine;

import java.util.Scanner;

enum State {
    CHOOSING_AN_ACTION ("back"),
    BUY ("buy"),
    EXIT ("exit"),
    TAKE ("take"),
    FILL ("fill"),
    REMAINING ("remaining");

    private String action;

    State(String action) {
        this.action = action;
    }

    public static State findStateByAction(String action) {
        for (State state : values()) {
            if (state.action.equals(action)) {
                return state;
            }
        }
        return null;
    }

}

public class CoffeeMachine {

    static boolean exit = false;
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int cash = 550;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userHandle(scanner.nextLine());
        }

    }

    public static void userHandle(String s) {

        State state = State.findStateByAction(s);

        if (state == null) {
            System.out.println("Error, Try Again.\n");
            return;
        }
        switch (state) {
            case CHOOSING_AN_ACTION:
                break;
            case BUY:
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                buy();
                break;
            case EXIT:
                exit = true;
                break;
            case TAKE:
                take();
                break;
            case FILL:
                fill();
                break;
            case REMAINING:
                remaining();
                break;

        }


    }

    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += scanner.nextInt();
        System.out.println();
        scanner.nextLine();
    }

    public static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + cash + " of money");
        System.out.println();
    }

    public static void take() {
        System.out.println();
        System.out.println("I gave you $" + cash);
        System.out.println();
        cash = 0;
    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s) {
            case "1":
                if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                    water -= 250;
                    coffeeBeans -= 16;
                    cash += 4;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (water < 250) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (coffeeBeans < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                }
                System.out.println();
                break;
            case "2":
                if (water >= 350 && coffeeBeans >= 20 && cups >= 1 && milk >= 75) {
                    water -= 350;
                    coffeeBeans -= 20;
                    milk -= 75;
                    cash += 7;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (water < 350) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (coffeeBeans < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    if (milk < 75) {
                        System.out.println("Sorry, not enough milk!");
                    }
                }
                System.out.println();
                break;
            case "3":
                if (water >= 200 && coffeeBeans >= 12 && cups >= 1 && milk >= 100) {
                    water -= 200;
                    coffeeBeans -= 12;
                    milk -= 100;
                    cash += 6;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (water < 200) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (coffeeBeans < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    if (milk < 100) {
                        System.out.println("Sorry, not enough milk!");
                    }
                }
                System.out.println();
                break;
            case "back":
                System.out.println();
                break;
            default:
                System.out.println("error!");
                break;

        }

    }




//                    System.out.println("Write how many ml of water you want to add:");
//                    water += scanner.nextInt();
//                    System.out.println("Write how many ml of milk you want to add:");
//                    milk += scanner.nextInt();
//                    System.out.println("Write how many grams of coffee beans you want to add:");
//                    coffeeBeans += scanner.nextInt();
//                    System.out.println("Write how many disposable cups of coffee you want to add:");
//                    cups += scanner.nextInt();
//                    System.out.println();
//                    scanner.nextLine();
//                    break;
//                case "take":
//                    System.out.println("I gave you $" + cash);
//                    System.out.println();
//                    cash = 0;
//                    break;
//                case "remaining":
//                    System.out.println("The coffee machine has:");
//                    System.out.println(water + " ml of water");
//                    System.out.println(milk + " ml of milk");
//                    System.out.println(coffeeBeans + " g of coffee beans");
//                    System.out.println(cups + " disposable cups");
//                    System.out.println("$" + cash + " of money");
//                    System.out.println();
//                    break;




}

//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = scanner.nextInt();
//        System.out.println("For " + cups + " cups of coffee you will need:");
//        System.out.println(cups * 200 + " ml of water");
//        System.out.println(cups * 50 + " ml of milk");
//        System.out.println(cups * 15 + " g of coffee beans");
//
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
//
//        System.out.println("Write how many ml of water the coffee machine has:");
//        int water = scanner.nextInt();
//        int possibleCups = water / 200;
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milk = scanner.nextInt();
//        if (milk / 50 < possibleCups) {
//            possibleCups = milk / 50;
//        }
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int beans = scanner.nextInt();
//        if (beans / 15 < possibleCups) {
//            possibleCups = beans / 15;
//        }
//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = scanner.nextInt();
//
//        if (cups == possibleCups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (cups < possibleCups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCups - cups) + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + possibleCups + " cup(s) of coffee");
//        }

//        int cash = 550;
//        int water = 400;
//        int milk = 540;
//        int coffeeBeans = 120;
//        int cups = 9;
//        boolean exit = false;
//
//
//
//        while (!exit) {
//
//            System.out.println("Write action (buy, fill, take, remaining, exit):");
//
//            String action = scanner.nextLine();
//            System.out.println();
//
//
//            switch (action) {
//                case "buy":
//                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
//                    String coffeeType = scanner.nextLine();
//                    switch (coffeeType) {
//                        case "1":
//                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
//                                water -= 250;
//                                coffeeBeans -= 16;
//                                cash += 4;
//                                cups -= 1;
//                                System.out.println("I have enough resources, making you a coffee!");
//                            } else {
//                                if (water < 250) {
//                                    System.out.println("Sorry, not enough water!");
//                                }
//                                if (coffeeBeans < 16) {
//                                    System.out.println("Sorry, not enough coffee beans!");
//                                }
//                                if (cups < 1) {
//                                    System.out.println("Sorry, not enough cups!");
//                                }
//                            }
//                            System.out.println();
//                            break;
//                        case "2":
//                            if (water >= 350 && coffeeBeans >= 20 && cups >= 1 && milk >= 75) {
//                                water -= 350;
//                                coffeeBeans -= 20;
//                                milk -= 75;
//                                cash += 7;
//                                cups -= 1;
//                                System.out.println("I have enough resources, making you a coffee!");
//                            } else {
//                                if (water < 350) {
//                                    System.out.println("Sorry, not enough water!");
//                                }
//                                if (coffeeBeans < 20) {
//                                    System.out.println("Sorry, not enough coffee beans!");
//                                }
//                                if (cups < 1) {
//                                    System.out.println("Sorry, not enough cups!");
//                                }
//                                if (milk < 75) {
//                                    System.out.println("Sorry, not enough milk!");
//                                }
//                            }
//                            System.out.println();
//                            break;
//                        case "3":
//                            if (water >= 200 && coffeeBeans >= 12 && cups >= 1 && milk >= 100) {
//                                water -= 200;
//                                coffeeBeans -= 12;
//                                milk -= 100;
//                                cash += 6;
//                                cups -= 1;
//                                System.out.println("I have enough resources, making you a coffee!");
//                            } else {
//                                if (water < 200) {
//                                    System.out.println("Sorry, not enough water!");
//                                }
//                                if (coffeeBeans < 12) {
//                                    System.out.println("Sorry, not enough coffee beans!");
//                                }
//                                if (cups < 1) {
//                                    System.out.println("Sorry, not enough cups!");
//                                }
//                                if (milk < 100) {
//                                    System.out.println("Sorry, not enough milk!");
//                                }
//                            }
//                            System.out.println();
//                            break;
//                        case "back":
//                            System.out.println();
//                            break;
//                        default:
//                            System.out.println("error!");
//                            break;
//                    }
//                    break;
//                case "fill":
//                    System.out.println("Write how many ml of water you want to add:");
//                    water += scanner.nextInt();
//                    System.out.println("Write how many ml of milk you want to add:");
//                    milk += scanner.nextInt();
//                    System.out.println("Write how many grams of coffee beans you want to add:");
//                    coffeeBeans += scanner.nextInt();
//                    System.out.println("Write how many disposable cups of coffee you want to add:");
//                    cups += scanner.nextInt();
//                    System.out.println();
//                    scanner.nextLine();
//                    break;
//                case "take":
//                    System.out.println("I gave you $" + cash);
//                    System.out.println();
//                    cash = 0;
//                    break;
//                case "remaining":
//                    System.out.println("The coffee machine has:");
//                    System.out.println(water + " ml of water");
//                    System.out.println(milk + " ml of milk");
//                    System.out.println(coffeeBeans + " g of coffee beans");
//                    System.out.println(cups + " disposable cups");
//                    System.out.println("$" + cash + " of money");
//                    System.out.println();
//                    break;
//                case "exit":
//                    exit = true;
//                    break;
//
//                default:
//                    System.out.println("error!");
//                    break;
//
//
//            }
//
//        }

