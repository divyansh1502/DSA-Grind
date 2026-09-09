
import java.util.ArrayList;
import java.util.Scanner;


public class QRder {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> cart = new ArrayList<>();
    static double total = 0;
    static String orderID = "1001";
    public static void main(String[] args) {
        System.out.println("====================QRder===================");
        System.out.println();
        System.out.println("1. USER");
        System.out.println("2. ADMIN");
        System.out.println("3. EXIT");
        System.out.println();
        System.out.print("Enter a Input: ");
        int inp = sc.nextInt();
        System.out.println();

        switch (inp) {
            case 1:
                user();
                break;
            case 2:
                admin();
                break;
            case 3:
                System.out.println("Thanks for Visiting");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    static void user() {
        while(true) {
            System.out.println("===============USER CONSOLE=================");
            System.out.println();
            System.out.println("1. View Food Menu");
            System.out.println("2. Search Food");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Remove Food from Cart");
            System.out.println("6. Place Order");
            System.out.println("7. View Order");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Enter a Input: ");
            int inp = sc.nextInt();

            switch (inp) {
                case 1:
                    System.out.println("1. You choose View Food Menu");
                    foodMenu();
                    break;
                case 2:
                    System.out.println("2. You choose Search Food");
                    serachFood();
                    break;
                case 3:
                    System.out.println("3. You choose Add to Cart");
                    addToCart();
                    break;
                case 4:
                    System.out.println("4. You choose View Cart");
                    viewCart();
                    break;
                case 5:
                    System.out.println("5. You choose Remove Food from Cart");
                    removeFood();
                    break;
                case 6:
                    System.out.println("6. You choose Place Order");
                    placeOrder();
                    break;
                case 7:
                    System.out.println("7. You choose View Order");
                    viewOrder();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }    
    }
    //Food Menu
    static void foodMenu() {
        System.out.println();
        System.out.println("===================Food Menu===================");
        System.out.println("ID      Name            Category            Price");
        System.out.println("1       Burger          Fast Food           120 Rs");
        System.out.println("2       Pizza           Fast Food           180 Rs");
        System.out.println("3       Biryani         Main Course         240 Rs");
        System.out.println("4       Coke            Beverage             40 Rs");
        System.out.println("5       Pasta           Italian              80 Rs");
        System.out.println();
    }
    //Search Food
    static void serachFood() {
        System.out.println();
        System.out.print("Enter Food Name: ");
        String inp = sc.next().toLowerCase();
        System.out.println();

        if(inp.equals("burger")) {
            System.out.println("Food Found: ");
            System.out.println("ID: 1");
            System.out.println("Name: Burger");
            System.out.println("Cateogry: Fast Food");
            System.out.println("Price: 120 RS");
        } else if(inp.equals("pizza")) {
            System.out.println("Food Found: ");
            System.out.println("ID: 2");
            System.out.println("Name: Pizza");
            System.out.println("Cateogry: Fast Food");
            System.out.println("Price: 180 RS");
        } else if(inp.equals("biryani")) {
            System.out.println("Food Found: ");
            System.out.println("ID: 3");
            System.out.println("Name: Biryani");
            System.out.println("Cateogry: Main Course");
            System.out.println("Price: 240 RS");
        } else if(inp.equals("coke")) {
            System.out.println("Food Found: ");
            System.out.println("ID: 4");
            System.out.println("Name: Coke");
            System.out.println("Cateogry: Beverage");
            System.out.println("Price: 40 RS");
        } else if(inp.equals("pasta")) {
            System.out.println("Food Found: ");
            System.out.println("ID: 5");
            System.out.println("Name: Pasta");
            System.out.println("Cateogry: Italian");
            System.out.println("Price: 80 RS");
        } else {
            System.out.println("Food Not Found ");
        }
    }
    // Add to Cart
    static void addToCart() {
        System.out.println();
        System.out.println("==================Add to Cart================");
        System.out.print("Enter Food ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        switch (id) {
            case 1:
                System.out.println("Burger * " + quantity + " added to Cart.");
                break;
            case 2:
                System.out.println("Pizza * " + quantity + " added to Cart.");
                break;
            case 3:
                System.out.println("Biryani * " + quantity + " added to Cart.");
                break;
            case 4:
                System.out.println("Coke * " + quantity + " added to Cart.");
                break;
            case 5:
                System.out.println("Pasta * " + quantity + " added to Cart.");
                break;    
            default:
                System.out.println("Oops! You entered wrong ID");
            }
            cart.add(id);
            cart.add(quantity);
    }
    // View Cart
    static void viewCart() {
        System.out.println();
        if(cart.isEmpty()) {
            System.out.println("No item in cart");
            System.out.println();
        } else {
            System.out.println("=================Your Cart==================");
        System.out.println("Food        Quantity        Price       Total");
        
        for (int i = 0; i < cart.size(); i++) {
            if(i % 2 == 0) {
                if(cart.get(i) == 1) {
                    System.out.println("Burger         " + cart.get(i + 1) + "            120 Rs      " + 120 * cart.get(i + 1) + " Rs");
                    total += 120 * cart.get(i + 1);
                }
                else if(cart.get(i) == 2) {
                    System.out.println("Pizza          " + cart.get(i + 1) + "            180 Rs      " + 180 * cart.get(i + 1) + " Rs");
                    total += 180 * cart.get(i + 1);
                }
                else if(cart.get(i) == 3) {
                    System.out.println("Biryani        " + cart.get(i + 1) + "            240 Rs      " + 240 * cart.get(i + 1) + " Rs");
                    total += 240 * cart.get(i + 1);
                }
                else if(cart.get(i) == 4) {
                    System.out.println("Coke           " + cart.get(i + 1) + "             40 Rs      " + 40 * cart.get(i + 1) + " Rs");
                    total += 40 * cart.get(i + 1);
                }
                else if(cart.get(i) == 5) {
                    System.out.println("Pasta          " + cart.get(i + 1) + "             80 Rs      " + 80 * cart.get(i + 1) + " Rs");
                    total += 80 * cart.get(i + 1);
                }
                else {
                    System.out.println("No item in Cart");
                }
            }
        }
            System.out.println();
            System.out.println("                                 Total: " + total + " Rs");
        }
    }
    // remove food from cart
    static void removeFood() {
        System.out.println();
        System.out.print("Enter Food id to remove it: ");
        int inp = sc.nextInt();
        for (int i = 0; i < cart.size(); i++) {
            if(i % 2 == 0) {
                if(inp == cart.get(i)) {
                    cart.remove(cart.get(i));//Remove Food
                    cart.remove(cart.get(i));//Remove Quantity
                    System.out.println("Item Removed Successfully");
                }
            }
        }
        
    }
    // Place order
    static void placeOrder() {
        System.out.println();
        System.out.println("==================Place Order====================");
        System.out.println("Total Amount: " + total + " Rs"); 
        System.out.println();
        System.out.println("Confirm Order: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Order placed successfully!");
            System.out.println("Order id: " + orderID);
            System.out.println("Total : " + total);
        } else if(choice == 2) {
            System.out.println("Order cancelled successfully!");
            cart.clear();
        }
    }
    //View Order
    static void viewOrder() {
        System.out.println();
        System.out.println("====================View Order====================");
        System.out.println();
        System.out.println("Order ID: " + orderID);
        System.out.println();
        for (int i = 0; i < cart.size(); i++) {
            if(i % 2 == 0) {
                if(cart.get(i) == 1) {
                    System.out.println("Burger         x" + cart.get(i + 1));
                }
                else if(cart.get(i) == 2) {
                    System.out.println("Pizza          x" + cart.get(i + 1));
                }
                else if(cart.get(i) == 3) {
                    System.out.println("Biryani        x" + cart.get(i + 1));
                }
                else if(cart.get(i) == 4) {
                    System.out.println("Coke           x" + cart.get(i + 1));
                }
                else if(cart.get(i) == 5) {
                    System.out.println("Pasta          x" + cart.get(i + 1));
                }
                else {
                    System.out.println("No item in Cart");
                }
            }
        }
        System.out.println();
        System.out.println("Total amount: " + total);
        System.out.println("Status: PLACED");
    }

    static void admin() {
        System.out.println("Admin fn");
    }
}
