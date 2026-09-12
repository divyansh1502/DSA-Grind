import java.util.Scanner;

public class OrderManager {
    static Scanner sc = new Scanner(System.in);
    static int choice = 0;
    static String status = "Pending";
    void orderManager() {
        while(choice != 5) {
            System.out.println();
            System.out.println("===============Order Manager Menu================");
            System.out.println();
            System.out.println("1. View All Orders");
            System.out.println("2. View Pending Order");
            System.out.println("3. Update Order Status");
            System.out.println("4. View Completed Order");
            System.out.println("5. Back");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                viewAllOrders();
                break;
            case 2:
                viewPendingOrders();
                break;
            case 3:
                updateOrderStatus();
                break;
            case 4:
                viewCompletedOrder();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
        
    }
    void viewAllOrders() {
        QRder.viewOrder();
    }
    void viewPendingOrders() {
        if(status == "Pending") {
            QRder.viewOrder();
        } else {
            System.out.println("No Pending Order");
        }
    }
    static String updateOrderStatus() {
        System.out.println();
        System.out.println("1. Placed");
        System.out.println("2. Processing");
        System.out.println("3. Ready");
        System.out.println("4. Completed");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                status = "Pending";
                break;
            case 2:
                status = "Placed";
                break;
            case 3:
                status = "Ready";
                break;
            case 4:
                status = "Completed";
                break;
            default:
                System.out.println("Enter valid input");
                break;
        }
        return status;
    }
    void viewCompletedOrder() {
        if(status == "Completed") {
            QRder.viewOrder();
        } else {
            System.out.println("No Order is completed yet");
        }
    }
}
