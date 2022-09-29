// import java.util.Scanner;

// public class Payment {
//     // FIELDS
//     private int amountDrinks;
//     private int amountFood;
//     private static int total;
//     private int amountPaid;
//     private static int bankAccount;

//     // CONSTRUCTOR
//     public Payment(int customerPaid) {
//         System.out.println("The outstanding balance is: " + total + " €");
//         amountPaid = customerPaid;
//         paymentCalculator();
//         bank();
//     }

//     // METHODS
//     public void paymentCalculator() {
//         int leftoverMoney;
//         if (amountPaid < total) {
//             total -= amountPaid;
//             System.out.println("You think it's a gift-shop? You still need to pay: " + total);
//             paymentCalculator();
//         } else if (amountPaid > total) {
//             System.out.println("You have " + (amountPaid - total) + "left over. \n" + "Would you like to tip the chef the remaining amount? (Yes or No");
//             Scanner sc = new Scanner(System.in);
//             String question = sc.nextLine();
//             if (question.startsWith("Y")) {
//                 bank();
//                 System.out.println("Thanks!");
//             } else {
//                 System.out.println("Here's the remaining amount.\n" + amountPaid);
//                 amountPaid -= total;
//                 total -= total;
//             }
//             sc.close();
//         }
//     }

//     public int getTotal() {
//         return total;
//     }

//     public void setTotal(int insertTotal) {
//         total = insertTotal;
//     }

//     public static void bank() {
//         bankAccount += total;
//     }

//     public void printBank(){
//         System.out.println("The current balance on Trattoria bankAccount: " + bankAccount);
//     }
// }