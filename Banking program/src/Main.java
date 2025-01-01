import java.util.*;

public class Main {
    public static void main(String[] args) {  // Main menu of the Banking program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the National Bank of Java!");
        System.out.println("This is the main menu, for deposit or withdraws, press 1, \n" +
                "to check your account balance, press 2");
        String input = scanner.nextLine();
        if (input.equals("1")) { // sends to the Transaction menu
            System.out.println("Welcome to the deposit menu!");
            DepositorWithdraw();
        }
        else if (input.equals("2")) {  // To check the balance
            System.out.println("Checking your account balance...");
            checkBalance();
        }
        else {
            System.out.println("Invalid input!");
        }
    }
    public static void DepositorWithdraw() {
        Transactions.main(null);  // Transfers to the Deposit Menu
    }
    public static void checkBalance() {
        Balance.main(null);  // Transfers to the Menu to check your balance
    }
}
