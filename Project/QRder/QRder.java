
import java.util.ArrayList;
import java.util.Scanner;


public class QRder {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> cart = new ArrayList<>();
    static double total = 0;
    static String orderID = "1001";
    static String gmail = "a";
    static String password = "a";
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
                case 8:
                    System.out.println("Thanks for Visting!");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }    
    }
    // Accesing Food items by ID
    static int foodbyID(int inp){
        if(inp == 1) {
            return 120;
        } if (inp == 2) {
            return 180;
        } if (inp == 3) {
            return 240;
        } if (inp == 4) {
            return 40;
        } if (inp == 5) {
            return 80;
        } 
        return 1;
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
        char ch = 'y';
        while(ch == 'y') {
            System.out.println();
            System.out.println("==================Add to Cart================");
            System.out.print("Enter Food ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            cart.add(id);
            cart.add(quantity);
            switch (id) {
                case 1:
                    System.out.println("Burger * " + quantity + " added to Cart.");
                    int burgerIndex = cart.indexOf(1);
                    total += 120 * cart.get(burgerIndex + 1);
                    break;
                case 2:
                    System.out.println("Pizza * " + quantity + " added to Cart.");
                    int pizzaIndex = cart.indexOf(2);
                    total += 180 * cart.get(pizzaIndex + 1);
                    break;
                case 3:
                    System.out.println("Biryani * " + quantity + " added to Cart.");
                    int biryaniIndex = cart.indexOf(3);
                    total += 240 * cart.get(biryaniIndex + 1);
                    break;
                case 4:
                    System.out.println("Coke * " + quantity + " added to Cart.");
                    int cokeIndex = cart.indexOf(4);
                    total += 40 * cart.get(cokeIndex + 1);
                    break;
                case 5:
                    System.out.println("Pasta * " + quantity + " added to Cart.");
                    int patsaIndex = cart.indexOf(5);
                    total += 80 * cart.get(patsaIndex + 1);
                    break;    
                default:
                    System.out.println("Oops! You entered wrong ID");
                }
                
                System.out.println();
                System.out.print("Do you want to add more items (y/n): ");
                ch = sc.next().toLowerCase().charAt(0);
                
            }
            System.out.println("Order added to your cart.");
        
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
        
        double price = total;
        for (int i = 0; i < cart.size(); i++) {
            if(i % 2 == 0) {
                if(cart.get(i) == 1) {
                    System.out.println("Burger         " + cart.get(i + 1) + "            120 Rs      " + 120 * cart.get(i + 1) + " Rs");
                }
                else if(cart.get(i) == 2) {
                    System.out.println("Pizza          " + cart.get(i + 1) + "            180 Rs      " + 180 * cart.get(i + 1) + " Rs");
                }
                else if(cart.get(i) == 3) {
                    System.out.println("Biryani        " + cart.get(i + 1) + "            240 Rs      " + 240 * cart.get(i + 1) + " Rs");
                }
                else if(cart.get(i) == 4) {
                    System.out.println("Coke           " + cart.get(i + 1) + "             40 Rs      " + 40 * cart.get(i + 1) + " Rs");
                }
                else if(cart.get(i) == 5) {
                    System.out.println("Pasta          " + cart.get(i + 1) + "             80 Rs      " + 80 * cart.get(i + 1) + " Rs");
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
                    int price = foodbyID(cart.get(i));
                    total = total - (price * cart.get(i + 1));
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
                    System.out.println("Burger         x" + cart.get(i + 1) + "             Rs. " + 120*cart.get(i + 1));
                }
                else if(cart.get(i) == 2) {
                    System.out.println("Pizza          x" + cart.get(i + 1) + "             Rs. " + 180*cart.get(i + 1));
                }
                else if(cart.get(i) == 3) {
                    System.out.println("Biryani        x" + cart.get(i + 1) + "             Rs. " + 240*cart.get(i + 1));
                }
                else if(cart.get(i) == 4) {
                    System.out.println("Coke           x" + cart.get(i + 1) + "             Rs. " + 40*cart.get(i + 1));
                }
                else if(cart.get(i) == 5) {
                    System.out.println("Pasta          x" + cart.get(i + 1) + "             Rs. " + 80*cart.get(i + 1));
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
        System.out.print("Enter your gmail: ");
        String mail = sc.next();
        System.out.print("Enter your password: ");
        String pass = sc.next();
        System.out.println();
        if(gmail.equals(mail) && password.equals(pass)) {
            System.out.println("Admin logged in successfully!");
        } else {
            System.out.println("Wrong gmail or password");
        }
        int inp = 0;
        while(inp != 5) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("                  ADMIN PANNEL               ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Welcome, Admin");
        System.out.println();
        System.out.println("1. Food Management");
        System.out.println("2. Order Management");
        System.out.println("3. Outlet Management");
        System.out.println("4. View Statsistics");
        System.out.println("5. Logout");
        System.out.print("Enter choice: ");
        inp = sc.nextInt();
        FoodManager fm = new FoodManager();
        switch(inp) {
            case 1:
                fm.foodOperationMenu();;
                break;
            case 2:
            
            

        }
    }
    }
}
class FoodManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Food> foodList = new ArrayList<>();
    
    void foodOperationMenu() {
        int inp = 0;
        while(inp != 6) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("                FOOD SECTION                 ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("1. Add Food");
        System.out.println("2. View Food");
        System.out.println("3. Search Food");
        System.out.println("4. Update Food");
        System.out.println("5. Delete Food");
        System.out.println("6. Back");
        System.out.println();
        System.out.print("Enter choice: ");
        inp = sc.nextInt();
        switch (inp) {
            case 1:
                addFood();
                break;
            case 2:
                viewFood();
                break;
            case 3:
                searchFood();
                break;
             
        }
    }
    }
        void addFood() {
            System.out.println();
            System.out.println("=============================================");
            System.out.println("                    ADD FOOD                 ");
            System.out.println("=============================================");
            System.out.println();
            System.out.print("Food ID       : ");
            Food f = new Food();
            int id = sc.nextInt();
            f.setId(id);;
            sc.nextLine();
            System.out.print("Food Name     : ");
            String food = sc.next();
            f.setFood(food);
            sc.nextLine();
            System.out.print("Category      : ");
            String category = sc.nextLine();
            f.setCategory(category);
            System.out.print("Price         : ");
            double price = sc.nextDouble();
            f.setPrice(price);
            foodList.add(f);
            System.out.println(); 
            System.out.print("Food added successfylly!");
            System.out.println();
        }
        void viewFood() {
            System.out.println();
            System.out.println("ID      Name         Category        Price");
            System.out.println("------------------------------------------------");
            for (int i = 0; i < foodList.size(); i++) {
                Food f = foodList.get(i);
                System.out.println(f.getId() + "     " + f.getFood() + "         " + f.getCategory() + "        " + f.getPrice());
            }
        }
        void searchFood() {
            System.out.println();
            System.out.print("Enter Food ID: ");
            int inp = sc.nextInt();
            System.out.println();
            for (int i = 0; i < foodList.size(); i++) {
                Food f = foodList.get(i);
                if(inp == f.getId()) {
                    System.out.println();
                    System.out.println("Food Found");
                    System.out.println("Food ID: " + f.getId());
                    System.out.println("Food Name: " + f.getFood());
                    System.out.println("Food Category: " + f.getCategory());
                    System.out.println("Food Price: " + f.getPrice());
                }
            }
            
        }
}
