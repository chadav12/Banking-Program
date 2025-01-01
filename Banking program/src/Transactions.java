import java.util.*;


public class Transactions {
    private static ArrayList<Float> depositHistory = new ArrayList<>();  // List to store the Deposit or withdraw
    static float totalBalance;
    public static void main(String[] args) {
        while (true) {  // First loop that works with the start of the program for error handling
            try {  // Works best due to having float and a string involved, Handles possible errors
                Scanner scanner = new Scanner(System.in);  // This scanner is for the float input
                System.out.print("For deposit, press 1, for withdraw, press 2: ");
                String input = scanner.nextLine();
                if (input.equals("1")) {  // Transitions to the deposit menu
                    System.out.print("Enter the amount to deposit: ");
                    float amount = scanner.nextFloat();
                    System.out.println("You entered, $" + amount + " dollars.");
                    Scanner scanner1 = new Scanner(System.in);  // This is used for the String input
                    while (true) {  // Creates a separate loop for error handling
                        System.out.println("Do you wish to continue with the deposit? Y or N: ");
                        String choice = scanner1.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            System.out.println("You deposited, $" + amount + " dollars.");
                            depositHistory.add(amount); // Adds the amount to the deposit history
                            totalBalance += amount;
                            System.out.println("Current balance is $" + totalBalance); // Displays current account balance!
                            // TODO Add a print receipt function

                            Main.main(args);
                            break;
                        } else if (choice.equalsIgnoreCase("n")) {  // Will send user back to the main menu
                            System.out.println("No deposit has been made.");
                            Main.main(args);
                            break;
                        } else {
                            System.out.println("Invalid input.");  // First Invalid input for error handling
                        }
                    }
                }
                else if (input.equals("2")) {// Transitions to the Withdraw menu
                    while (true) {
                        System.out.print("Enter the amount to withdraw: ");
                        float amount = scanner.nextFloat();
                        if (amount < totalBalance) {
                            System.out.println("You entered, $" + amount + " dollars.");
                            System.out.println("$" + amount + " - $" + totalBalance);  // Calculates how much has been deducted
                            totalBalance -= amount;
                            System.out.println("Current balance now is $" + totalBalance);
                            Main.main(args);
                            break;
                        }
                        else if (amount > totalBalance) {  // Prevents error occurring leading to a negative balance
                            System.out.println("Can not complete action as it would result in a negative balance.");
                            Transactions.main(args);
                            break;
                        }
                        else {
                            System.out.println("Invalid response");
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid response.");  // Prevents possible errors that could be involved
            }
        }
    }
}


