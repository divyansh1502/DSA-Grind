import java.util.Scanner;

public class Statistics {
    static Scanner sc = new Scanner(System.in);
    public void qrderStats() {
        System.out.println();
        System.out.println("================QRDER STATISTICS==============");
        System.out.println();
        System.out.println("Total Orders        : " + QRder.totalOrders);
        System.out.println("Pending Orders      : " + OrderManager.pendingOrders);
        System.out.println("Preparing Orders    : " + OrderManager.preparingOrders);
        System.out.println("Ready Orders        : " + OrderManager.readyOrders);
        System.out.println("Completed Orders    : " + OrderManager.completedOrders);
        System.out.println();
        System.out.println("Total Revenue       : " + QRder.total);
        System.out.println();
        System.out.println("=======================================");
        System.out.println("1. Back");
        int inp = sc.nextInt();

        if(inp == 1) {
            QRder.admin();
        } else {
            System.out.println("Wrong Input");
        }
    }
}
