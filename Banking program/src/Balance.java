import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Current account balance: $" + Transactions.totalBalance);  // Displays balance
                System.out.print("To return to the main menu, Press 1, to quit, press 2: ");
                String choice = sc.nextLine();
                if (choice.equals("1")) {
                    Main.main(args);
                    break;
                } else if (choice.equals("2")) {
                    System.exit(0);
                    break;
                } else {
                    System.out.println("Invalid choice");  // Handles all current errors from invalid input
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Response."); // Helps with error handling
            }
        }
    }
}
