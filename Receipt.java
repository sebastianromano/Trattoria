// import java.util.Scanner;

// /**
//  * Receipt class creates a Receipt (class) of the Order (class) from the individual Customer (class) 
//  */
// public class Receipt {

//     // FIELDS
//     private String receiptID;
//     private String customerNameEx;
//     private int tip;
//     // Customer newCustomer = new Customer(customerNameEx);

//     // CONSTRUCTOR
//     // public Receipt(String customerName) {
//     //     // collects all items from specific Customer class
//     //     customerNameEx = customerName;
//     //     newCustomer.checkOutCounter();
//     //     printReceipt();
//     //     }
    
//     // METHODS
//     /**
//      * Create receiptID
//      */
//     // public String getReceiptID(String customerName) {
//     //     return newCustomer.getCustomerName().substring(0, 4) + newCustomer.getCustomerID();
//     // }

//     public void tippingCalculator() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How much would you like tip? \n 10, 20, or 50 percent?");
//         tip = sc.nextInt();
//         sc.close();
//     }

//     /**
//      * print the receipt
//      */
//     public void printReceipt() {
//         System.out.println("This receipt is for " + customerNameEx);
//         // System.out.println("____ ID ____" + newCustomer.getCustomerID());
//         System.out.println();
//         // System.out.println(); --> list of FOOD items
//         // System.out.println(); --> list of DRINKS items
//         // System.out.println(); --> price before VAT
//         // System.out.println(); --> total price
//         System.out.println();
//         System.out.println("would you like to give a tip? \n Type in \"Yes\" or \"No\"");
//         Scanner sc = new Scanner(System.in);
//         String question = sc.nextLine();
//         sc.close();
//         question.toLowerCase();
//         if (question == "yes") {
//             tippingCalculator();
//         } else {
//             System.out.println("OK, greedy bastard");
//         }

//     }
// }
