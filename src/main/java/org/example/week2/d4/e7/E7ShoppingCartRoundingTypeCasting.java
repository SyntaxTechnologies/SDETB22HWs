package org.example.week2.d4.e7;

public class E7ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1, item2, item3;

        item1=19.99;
        item2=29.75;
        item3=4.99;



        // Calculate total cost
        double totalCost= item1+item2+item3;

        // Type cast the double to an int to round it down
        int roundedCost=(int) totalCost;

        // Print the results
        System.out.println("The original total cost is $" + totalCost);
        System.out.println("The rounded total cost is $" + roundedCost);

    }
}
