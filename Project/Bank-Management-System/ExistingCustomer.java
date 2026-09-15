import java.util.ArrayList;
import java.util.Scanner;

public class ExistingCustomer {
    static private long accountNumber = 1234567890; 
    static private String password = "User@123";
    static private String name = "Divyansh Singh";
    static private String ifsc = "CBIN07890";
    static private String branch = "Sarojini Nagar, Lucknow";
    static private String status = "Active";
    static private double balance = 0;
    static Scanner sc = new Scanner(System.in);
    public static void coustomerLogin() {
        System.out.println();
        System.out.println("================Coustomer Login=================");
        System.out.println();
        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if(accountNumber == accNo && password.equals(pass)) {
            System.out.println();
            System.out.println("Coustomer Logged in Successfully!!");
            coustomerDashboard();
        } else {
            System.out.println();
            System.out.println("Oops! Wrong Account number or Password");
        }
    }
    public static void coustomerDashboard() {
        System.out.println();
        System.out.println("==================User Dashboard=================");
        System.out.println();
        System.out.println("1. Account Details");
        System.out.println("2. Check Balance");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Transfer Money");
        System.out.println("6. Transaction History");
        System.out.println("7. Logout");
        System.out.println();
        System.out.print("Enter a choice: ");
        int inp = sc.nextInt();
        while(inp != 7) {
            switch(inp) {
                case 1:
                    accountDetails();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    transferMoney();
                    break;
                case 6:
                    transactionHistory();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println();
            System.out.println("==================User Dashboard=================");
            System.out.println();
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Transaction History");
            System.out.println("7. Logout");
            System.out.println();
            System.out.print("Enter a choice: ");
            inp = sc.nextInt();
        }
        
    }   
    private static void accountDetails() {
        System.out.println();
        System.out.println("============Account Details============");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("IFSC Code : " + ifsc);
        System.out.println("Branch : " + branch);
        System.out.println("Bank Status : " + status);
        System.out.println();
    }
    private static void checkBalance() {
        System.out.println();
        System.out.println("==================Balance=================");
        System.out.println();
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    private static void depositMoney() {
        System.out.println();
        System.out.println("==================Deposit Money=================");
        System.out.println();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        balance += amt;
        Transaction transaction = new Transaction("Deposit", amt, balance);
        Transaction.transactions.add(transaction);
        System.out.println("Money Deposited Successfully!");
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
    private static void withdrawMoney() {
        System.out.println();
        System.out.println("==================Withdraw Money=================");
        System.out.println();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        if(balance >= amt) {
            balance -= amt;
            Transaction transaction = new Transaction("Withdraw", amt, balance);
            Transaction.transactions.add(transaction);
            System.out.println("Money Withdrawn Successfully!");
            System.out.println();
        } else {
            System.out.println("Low Balance!");
            System.out.println();
        }
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
    private static void transferMoney() {
        System.out.println();
        System.out.println("==================transfer Money=================");
        System.out.println();
        System.out.print("Enter Account Number: ");
        long acc = sc.nextLong();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        if(balance >= amt) {
            balance -= amt;
            Transaction transaction = new Transaction("Transfer", amt, balance);
            Transaction.transactions.add(transaction);
            System.out.println("Money Transferred Successfully!");
            System.out.println("Account Number: " + acc);
            System.out.println("Transferred Money: " + amt);
            System.out.println();
        } else {
            System.out.println("Low Balance!");
            System.out.println();
        }
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
    private static void transactionHistory() {
        System.out.println();
        System.out.println("=================Transaction History==============");
        System.out.println();
        if(Transaction.transactions.isEmpty()) {
            System.out.println("No transaction yet");
        } else {
            for (Transaction t : Transaction.transactions) {
                System.out.println();
                System.out.println("Type: " + t.type);
                System.out.println("Amount: " + t.amount);
                System.out.println("Balance After: " + t.balanceAfter);
                System.out.println();
            }
        }
    }
}
class Transaction {
    String type;
    double amount;
    double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }
    static ArrayList<Transaction> transactions = new ArrayList<>();
    
}