public class Main {
    public static void main(String[] args) {
        Customer newCustomer2 = new Customer();
        newCustomer2.checkIn();

        Customer newCustomer3 = new Customer();
        newCustomer3.checkOut();

        Customer newCustomer4 = new Customer();
        newCustomer4.checkIn();
        newCustomer4.checkIn();

        newCustomer2.checkOut();

        // Customer foo = new Customer();

        // Order newOrder = new Order();
        // boolean testInstance = newOrder instanceof Order;
        // System.out.println("newOrder is an instance of Order: " + testInstance);

        // Menu newFood = new Menu.Food();
        // boolean testInstanceFood = newFood instanceof Customer;
        // System.out.println("newFood is an instance of Order: " + testInstance);

    }
}
