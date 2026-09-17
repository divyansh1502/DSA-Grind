
import java.util.Scanner;


public class BMS {
    static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println();
        System.out.println("===============Bank Management System===============");
        System.out.println();
        System.out.println("1. Customer");
        System.out.println("2. Staff");
        System.out.println("3. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        int inp = sc.nextInt();
            while(inp != 3) {
                switch (inp) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    staffMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Input");
                }
                System.out.println("===============Bank Management System===============");
                System.out.println();
                System.out.println("1. Customer");
                System.out.println("2. Staff");
                System.out.println("3. Exit");
                System.out.println();
                System.out.print("Enter a choice: ");
                inp = sc.nextInt();
            }
            System.out.println("Thanks for visiting!!");
            }
            
    public static void customerMenu() {
        System.out.println();
        System.out.println("================Customer Menu================");
        System.out.println();
        System.out.println("1. Existing Coustomer");
        System.out.println("2. New Coustomer");
        System.out.println("3. Back");
        System.out.println();
        System.out.print("Enter a choice: ");
        int inp = sc.nextInt();
        System.out.println();
        
        while(inp != 3) {
            switch (inp) {
                case 1:
                    ExistingCustomer.coustomerLogin();
                    break;
                case 2:
                    NewCustomer.openAccount();
                    break;
                default:
                    System.out.println("Invaild Input");
                    System.out.println();
            }
            System.out.println();
            System.out.println("================Customer Menu================");
            System.out.println();
            System.out.println("1. Existing Coustomer");
            System.out.println("2. New Coustomer");
            System.out.println("3. Back");
            System.out.println();
            System.out.print("Enter a choice: ");
            inp = sc.nextInt();
        }
        
    }
    public static void staffMenu() {
        System.out.println();
        System.out.println("================Staff Menu================");
        System.out.println();

    }
}
