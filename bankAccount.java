import java.util.Scanner;
public class bankAccount {
    String name;
    double accNum;
    int balance;
    int wamount;

    public bankAccount(String name, double accNum, int initialBalance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double wamount) {
        balance -= wamount;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawn: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        double accNum = scanner.nextDouble();
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        bankAccount account = new bankAccount(name, accNum, initialBalance);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Check Balance");
            System.out.println("3. Display Account Details");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    account.checkBalance();
                    break;
                case 3:
                    account.displayAccountDetails();
                    break;
                case 4:
                    System.out.println("Enter the amount to Withdrawn: ");
                    double wamount = scanner.nextInt();
                    account.withdraw(wamount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    scanner.close();
            }
        }
    }
}