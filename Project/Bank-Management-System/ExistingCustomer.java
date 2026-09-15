import java.util.Scanner;

public class ExistingCustomer {
    static private long accountNumber = 1234567890; 
    static private String password = "User@123";
    static private String name = "Divyansh Singh";
    static private String ifsc = "CBIN07890";
    static private String branch = "Sarojini Nagar, Lucknow";
    static private String status = "Active";

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

    }
    private static void depositMoney() {

    }
    private static void withdrawMoney() {

    }
    private static void transferMoney() {

    }
    private static void transactionHistory() {

    }
}
