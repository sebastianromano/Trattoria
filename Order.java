import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Order { // Order HAS-A Menu
    private Scanner sc = new Scanner(System.in);
    protected HashMap<Integer, String> order; 
    Menu newFood;
    Menu newDrink;

    /**
     * CONSTRUCTOR
     */
    public Order(){
        order = new HashMap<Integer, String>();
        // newFood = new Menu.Food();
        // newDrink = new Menu.Drink();
        // newFood.printMenu();
        Menu.importMenu();
        Menu.printMenu();
        setOrder();
    }
    
    public void setOrder(){
        Integer orderItemNo;
        System.out.println("\nWhat would you like to order?");
        do {
            int newKey = order.size()+1;
            System.out.println("\nPlease type the number from the menu, and hit 0 when done\n");
            orderItemNo = sc.nextInt();
            if (orderItemNo == 0) {
                break;
            } else if (orderItemNo < 0 || orderItemNo > Menu.menu.size()) {
                System.out.println("This item is not in the menu. Please try again.\n");
            } else if (order.containsValue(Menu.menu.get(orderItemNo))) {
                order.put(newKey, Menu.menu.get(orderItemNo)); // replace(orderItemNo, "I".concat(" ").concat(order.get(orderItemNo)));
            } else {
                order.put(newKey, Menu.menu.get(orderItemNo));
            }
        }
        while (orderItemNo != 0);
        System.out.println("\nThank you for your order.\n\nFood and Drinks are on the way!\n");
    }
    /**
     * 
     */
    public void orderSize(){
        System.out.println("Total number of items ordered: " + order.size());
    }
    /**
     * Print order
     */
    public void printOrder(){
        System.out.println("\n___________ YOUR ORDER __________\n");
        for (Entry<Integer, String> i : order.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
            System.out.println("_________________________________\n");
        }
        orderSize();
    }
}