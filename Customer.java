import java.util.Scanner;

/**
 * Customer class contains the customer information
 */
public class Customer { // Customer HAS-A Order
    private String customerName;
    private int customerNumber; // not static (bcs static = follows class, not instances (/objects), e.g. company name, college name that students go to)
    private int customerTotal;
    private String customerID;
    private String output = ""; // method: capitalLetter()
    private boolean paidBill;
    Scanner sc = new Scanner(System.in);
    Order newOrder;

    /**
     * CONSTRUCTOR
     */
    public Customer(){
    }
    /**
     * Customer check-in process
     */
    public void checkIn(){
        if (this.customerID != null){
            System.out.println("\nThis customer has already checked in\n");
        } else {
            welcomeText();
            System.out.println("\n(initiating check-in process...)");
            setCustomerTotal();
            setCustomerNumber();
            setCustomerName();
            setCustomerID();
            paidBill = false;
            newOrder = new Order();
        }
    }
    /**
     * Customer check-out process
     */
    public void checkOut(){
        if (this.customerID == null) {
            System.out.println("\nThis customer has not checked in yet\n");
            checkIn();
        } else if (paidBill == true){
            System.out.println("The bill is already paid, " + customerName);
        } else {
            newOrder.printOrder();
            removeOneCustomerFromTotal();
            paidBill = true;
            System.out.println("Remaining customers: " + getCustomerTotal());
            System.out.println("\n============= THANK YOU FOR YOUR VISIT, GOOD-BYE =============\n");
        }
    }
    /**
     * Get Customer name
     * @return customerName
     */
    public String getCustomerName(){
        return customerName;
    }
    /**
     * Set Customer name
     */
    public void setCustomerName(){
        do {
            System.out.println("\nPlease type in your name below:");
            customerName = sc.nextLine().trim().toLowerCase();
            customerName = capitalLetter(customerName);
        } while (customerName.isEmpty());
    }
    /**
     * Method for finding the length in int
     * @return length of customerName
     */
    public int nameLength(){
        return customerName.length();
    }
    /**
     * Get Customer number
     * @return customerNumber
     */
    public int getCustomerNumber(){
        return customerNumber;
    }
    /**
     * Set Customer number
     */
    public void setCustomerNumber(){
        customerNumber = customerTotal;
    }
    /**
     * Get Customer ID
     * @return customerID
     */
    public String getCustomerID(){
        return customerID;
    }
    /**
     * Set Customer ID
     */
    public void setCustomerID(){
        customerID = customerName.toLowerCase().concat(Integer.toString(customerTotal));
    }
    /**
     * Print Customer information
     */
    public void printCustomer(){
        System.out.println("\nName of customer: " + customerName.indent(1) + "\nID of customer: " + customerID.indent(1) + "\n");
    }
    /**
     * Print total number of Customer today
     */
    public void printCustomerTotal(){
        System.out.println("Total number of customers today: " + customerTotal + ".\n");
    }
    /**
     * Get total number of customers today
     * @return customerTotal
     */
    public int getCustomerTotal(){
        return customerTotal;
    }
    /**
     * Set total number of customers today
     */
    public void setCustomerTotal(){
        ++customerTotal;
    }
    /**
     * Remove one Customer from total Customer number
     */
    public void removeOneCustomerFromTotal(){
        --customerTotal;
    }
    /**
     * Capitalize first letter of something
     * @return first letter capitalized
     */
    public String capitalLetter(String input){
        input = input.toLowerCase();
        output += input.substring(0, 1).toUpperCase();
        output += input.substring(1);
        return output;
    }
    /**
     * Has Customer paid the bill
     */
    public void hasCustomerPaid(){
        if (paidBill == true) {
            System.out.println(this.customerName + " has paid the bill");
        } else {
            System.out.println(this.customerName + " has not paid the bill yet");
        }
    }
    /**
     * Welcome text
     */
    private void welcomeText() {
        System.out.println("\n============= TRATTORIA PRIMO È SECONDO RISTORANTE =============\n");
        System.out.println("Buonasere! \n\nWelcome to our family restaurant! \nMy name is Luigi, and I will be your waiter tonight.\n\nPlease let me check you in first...");
    }
}