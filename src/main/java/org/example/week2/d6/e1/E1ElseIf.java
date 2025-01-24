package org.example.week2.d6.e1;

public class E1ElseIf {
    public static void main(String[] args) {
        // Assign values to daily expenses
        var morningExpense=50.00;
        var afternoonExpense=16.00;
        var eveningExpense=10.25;

        // Calculate total expense
        var totalExpense= morningExpense+afternoonExpense+eveningExpense;
        System.out.println("Your total daily expense is: " +totalExpense);


        // Define a budget
        int budget=100;
        if(budget==100){
            System.out.println("You are within the budget.");
        }else{
            System.out.println("You are not within the budget.");
        }
            }
        }

