package org.example.week2.d6.e2;

public class E2ElseIf {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value
        int temperature = 25;

        // Check the temperature and print the message


        // Use if-else-if statements to check the value of temperature and print a message based on the following conditions:
    if (temperature>=30){
            System.out.println("It's hot outside.");
        } else if(temperature>=20){
            System.out.println("It's warm outside.");
        } else if (temperature>=10) {
        System.out.println("It's cool outside.");
        } else if (temperature<=10) {
        System.out.println("It's cold outside.");
        }

    }
}
