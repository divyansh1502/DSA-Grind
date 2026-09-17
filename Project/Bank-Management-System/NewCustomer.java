
import java.util.ArrayList;
import java.util.Scanner;

public class NewCustomer {
    static Scanner sc = new Scanner(System.in); 
    static private String ifsc = "CBIN07890";
    static private String branch = "Sarojini Nagar, Lucknow";
    static private double balance = 0;

        static void openAccount() {
        System.out.println();
        System.out.println("=============Personal Details=============");
        System.out.println();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        sc.nextLine();

        // Account Details
        System.out.println();
        System.out.println("===============Account Details===============");
        System.out.println();
        System.out.println("Select Account Type: ");
        System.out.println();
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        String accountType = "";
        if(ch == 1) {
            accountType = "Saving Account";
        } else {
            accountType = "Current Type";
        }
        System.out.println();

        long accountNo = (long)(Math.random() * 100000);
        long accountNumber = 8000000000L + accountNo;

        // Set Password
        System.out.println();
        System.out.println("==============Set Password============");
        System.out.println();
        System.out.print("Set Password: ");
        String pass = sc.next();
        System.out.print("Confirm Password: ");
        String confirmPass = sc.next();

        if(pass.equals(confirmPass)) {
            System.out.println("Password Matched!");
        } else {
            System.out.println("Oops! Password does't Matched");
            System.out.println("Try again");
        }

        //Initial Deposit
        System.out.println();
        System.out.println("================Initial Deposit==============");
        System.out.println();
        System.out.print("Enter initial Deposit: ");
        double initialDeposit = sc.nextDouble();
        balance += initialDeposit;
        System.out.println();
        System.out.println("Current Balance: " + balance);

        System.out.println();
        System.out.println("===========Account Created============");
        System.out.println();
        System.out.println("Name            : " + name);
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Account Type    : " + accountType);
        System.out.println("Balance         : " + balance);
        System.out.println();
        System.out.println("Please remember your account \nnumber and password");
        System.out.println();
        System.out.println("============================================");
        Customer customers = new Customer(name, email, phone, accountNumber, accountType, pass, initialDeposit);
        Customer.customers.add(customers);
    }

    
}
class Customer {
    String name;
    String email;
    long phone;
    long accountNumber;
    String accountType;
    String password;
    double balance;

    public Customer(String name, String email, long phone, long accountNumber, String accountType, String password, double balance) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.password = password;
        this.balance = balance;
    }

    static ArrayList<Customer> customers = new ArrayList<>();
}
