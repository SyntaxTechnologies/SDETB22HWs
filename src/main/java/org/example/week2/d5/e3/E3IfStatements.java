package org.example.week2.d5.e3;

public class E3IfStatements {
    public static void main(String[] args) {
        // Declare a string variable called name and assign it the value "Weqas"
        String name= "Weqas";

        // Declare a string variable called mobileNumber and assign it the value "123-456-7890"
        String mobileNumber="123-456-7890";

        // Declare an integer variable called age and assign it the value 45
        int age=45;


        // Print the user's information
        System.out.println("Your name is " +name +", your age is " +age+", and your mobile number is " +mobileNumber+"" );

        // Use a simple if-else condition to check if the user is 18 or older.
        if(age==45){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are not an adult.");
        }

        // If the user is 18 or older,then print You are an adult.

        // If the user is younger than 18,then print You are not an adult.

    }
}