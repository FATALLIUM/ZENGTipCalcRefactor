import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        // variables needed
        double foodCost = 0.0;

        System.out.println("Welcome.");

        System.out.println("How many people are in your group at the restaurant?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter tip percentage (0 - 100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.println("Type in -1 when you are finished with entering the costs.");

        // getting the costs
        while (foodCost != -1) {
            System.out.println("Enter the various costs (in dollars and cents) of each dish you have ordered: ");
            foodCost = scan.nextDouble();
            if (foodCost != -1) {
                foodCost += foodCost;  // only add item cost if it's not -1!
            }
        }

        TipCalculator dinner1 = new TipCalculator(numPeople, tipPercentage);

        double totalBillBeforeTip = dinner1.getTotalBillBeforeTip();
        int numPeople1 = dinner1.getNumPeople();
        int tipPercentage1 = dinner1.getTipPercentage();
//
//        // rounding the money
//        String formattedTotalBill = formatter.format(dinner1.totalBill());
//        String formattedTipAmount = formatter.format(dinner1.tipAmount());
//        String formattedBill = formatter.format(totalBillBeforeTip);
//        String formattedCostPerPersonBeforeTip = formatter.format(dinner1.perPersonCostBeforeTip());
//        String formattedTipPerPerson = formatter.format(dinner1.perPersonTipAmount());
//
//        // printing information
//        System.out.println("Your total bill before tip is: " + formattedBill + ".") ;
//        System.out.println("Your tip percentage is: " + tipPercentage1 + ".");
//        System.out.println("Your total tip is: " + formattedTipAmount + ".");
//        System.out.println("Your total bill with tip is: " + formattedTotalBill + ".");
//        System.out.println("Per person cost before tip: " + formattedCostPerPersonBeforeTip + ".");
//        System.out.println("Tip per person: " + formattedTipPerPerson + "." );
//        System.out.println(" ");
//        System.out.println("Thanks for using (pie is god) tip calculator.");
        System.out.println(totalBillBeforeTip);
    }
}
