// Node class representing an account holder
class AccountNode {
    String name;
    int accountNumber;
    AccountNode next;

    // Constructor to initialize the node with name and account number
    AccountNode(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.next = null;
    }
}

// LinkedList class containing operations for the banking system
class AccountLinkedList {
    AccountNode head;

    // Insert a new account holder at the end of the list
    public void insert(String name, int accountNumber) {
        AccountNode newNode = new AccountNode(name, accountNumber);
        if (head == null) {
            head = newNode;
        } else {
            AccountNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete an account holder by account number
    public void delete(int accountNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.accountNumber == accountNumber) {
            head = head.next;
            return;
        }
        AccountNode current = head;
        while (current.next != null && current.next.accountNumber != accountNumber) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Account holder not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Search for an account holder by account number
    public void search(int accountNumber) {
        AccountNode current = head;
        while (current != null) {
            if (current.accountNumber == accountNumber) {
                System.out.println("Account Holder Found: " + current.name + " (Account Number: " + current.accountNumber + ")");
                return;
            }
            current = current.next;
        }
        System.out.println("Account holder not found.");
    }

    // Print all account holders in the list
    public void printAll() {
        AccountNode current = head;
        if (current == null) {
            System.out.println("No account holders in the system.");
            return;
        }
        while (current != null) {
            System.out.println(current.name + " (Account Number: " + current.accountNumber + ")");
            current = current.next;
        }
    }
}

// Main class to demonstrate the banking system
public class SimpleBankingSystem {
    public static void main(String[] args) {
        AccountLinkedList bank = new AccountLinkedList();

        // Insert account holders
        bank.insert("John Doe", 12345);
        bank.insert("Jane Smith", 67890);

        // Print all account holders
        System.out.println("All Account Holders:");
        bank.printAll();

        // Delete an account holder
        System.out.println("\nDeleting Account Holder with Account Number 12345:");
        bank.delete(12345);

        // Print all account holders again
        System.out.println("\nAll Account Holders After Deletion:");
        bank.printAll();

        // Search for an account holder
        System.out.println("\nSearching for Account Holder with Account Number 67890:");
        bank.search(67890);
    }
}
