import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Menu class collects information from Food class and Drinks class
 * and contains the methods to alter, search or otherwise manipulate the two classes
 */
public interface Menu { // Menu HAS-A drink, a Menu HAS-A food
    public void setMenu();
    public String getItem(Integer getItem);
    public void changeName(Integer itemNo, String itemName);
    public static void importMenu() {
        Menu newFood = new Food();
        Menu newDrink = new Drink();
        Food.menu.putAll(menu);
    }
    public static HashMap<Integer, String> menu = new HashMap<Integer, String>();
    public static void printMenu() {
        System.out.println("\n============= FOOD =============\n");
        for (Entry<Integer, String> i : menu.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
            System.out.println("________________________________\n");
        }
    }
    /**
     * Food class contains food information
     */
    public class Food implements Menu { // Food IS-A (relationship) Menu
        /**
         * CONSTRUCTOR
         */
        public Food() {
            setMenu();
        }
        /**
         * Initial setup of food menu
         */
        public void setMenu() {
            Menu.menu.put(1, "Hawaii");
            Menu.menu.put(2, "Vegetariano");
            Menu.menu.put(3, "Carne");
            Menu.menu.put(4, "Bolognese");
            Menu.menu.put(5, "Carbonara");
        }
        /**
         * Display food menu
         */
        public void getMenu() {
            for (Entry<Integer, String> i : menu.entrySet()) {
                System.out.println(i.getKey() + ": " + i.getValue());
                System.out.println("________________________________\n");
            }
        }
        /**
         * Get food item
         */
        public String getItem(Integer getItem) {
            return menu.get(getItem);
        }
        /**
         * Replace food item (HashMap)
         */
        public void changeName(Integer itemNo, String newName){
            menu.replace(itemNo, newName);
        }
    }

    /**
     * Drinks class contains drink information
     */
    public class Drink implements Menu { // Drink IS-A (relationship) Menu
        /**
         * CONSTRUCTOR
         */
        public Drink(){
            setMenu();
        }
        /**
         * Initial setup of drink menu
         */
        public void setMenu(){
            menu.put(6, "Latte Macchiato");
            menu.put(7, "Cappuccino");
            menu.put(8, "Mojito");
            menu.put(9, "Vino Blanco (bottiglia)");
            menu.put(10, "Vino Rosso (bottiglia)");
        }
        /**
         * Display drink menu
         */
        public void getMenu() {
            System.out.println("\n============= FOOD =============\n");
            for (Entry<Integer, String> i : menu.entrySet()) {
                System.out.println(i.getKey() + ": " + i.getValue());
                System.out.println("________________________________\n");
            }
        }
        /**
         * Get drink item
         */
        public String getItem(Integer getItem) {
            return menu.get(getItem);
        }
        /**
         * Replace drink item (HashMap)
         */
        public void changeName(Integer itemNo, String newName){
            menu.replace(itemNo, newName);
        }
    }
}