
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");

        // Game setup
        boolean gameOver = false;
        int playerHealth = 100;
        int playerGold = 0;

        while (!gameOver) {
            System.out.println("\nYou are in a mystical land filled with adventures.");
            System.out.println("What would you like to do?");
            System.out.println("1. Explore");
            System.out.println("2. Check inventory and stats");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    explore(playerName, scanner, playerHealth, playerGold);
                    break;
                case 2:
                    displayInventoryAndStats(playerName, playerHealth, playerGold);
                    break;
                case 3:
                    System.out.println("Thanks for playing! Goodbye.");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }

    public static void explore(String playerName, Scanner scanner, int playerHealth, int playerGold) {
        System.out.println("You embark on an adventure!");

        // Game events and interactions
        System.out.println("You encounter a friendly NPC. What do you do?");
        System.out.println("1. Talk to the NPC");
        System.out.println("2. Ignore the NPC and continue exploring");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.println("The NPC gives you a quest to find a lost artifact.");
                System.out.println("Will you accept the quest? (yes/no)");
                String acceptQuest = scanner.nextLine();
                if (acceptQuest.equalsIgnoreCase("yes")) {
                    System.out.println("You accepted the quest! Good luck on your journey.");
                    // Logic for quest progression, item collection, etc.
                } else {
                    System.out.println("You declined the quest. The NPC nods understandingly.");
                }
                break;
            case 2:
                System.out.println("You continue exploring and find a hidden treasure chest!");
                playerGold += 50;
                System.out.println("You gained 50 gold coins.");
                break;
            default:
                System.out.println("Invalid input! Please enter a valid option.");
                break;
        }

        // Update player's health and gold
        playerHealth -= 10; // Example decrement for exploring
        System.out.println("Your health: " + playerHealth);
        System.out.println("Your gold: " + playerGold);
    }

    public static void displayInventoryAndStats(String playerName, int playerHealth, int playerGold) {
        System.out.println("Player Name: " + playerName);
        System.out.println("Health: " + playerHealth);
        System.out.println("Gold: " + playerGold);
    }
}
