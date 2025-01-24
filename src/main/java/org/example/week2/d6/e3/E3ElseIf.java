package org.example.week2.d6.e3;

public class E3ElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score1' as an int and assign 85 to it
        int score=85;

        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        if ( score>=90&&score<=100){
            System.out.println("Your grade is: " + "A");

        } else if (score>=85&&score<=89) {
            System.out.println("Your grade is: " + "B");
        } else if (score>=70&&score<=79) {
            System.out.println("Your grade is: " + "C");
        } else if (score>=60&&score<=69) {
            System.out.println("Your grade is: " + "D");
        } else if (score>=0&&score<=59) {
            System.out.println("Your grade is: " + "E");

        }

    }
}