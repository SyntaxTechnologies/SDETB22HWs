package org.example.week2.d4.e5;

public class E5PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlices = 13;
        int friends = 4;


        // Calculate slices per person
        int slicesPerPerson = totalSlices / friends;
        int leftoverSlices = totalSlices % friends;


        //Print the results

        System.out.println("Each person gets " +slicesPerPerson+ " slices. ");
        System.out.println("There are " +leftoverSlices+ " slices left over.");

    }
}

