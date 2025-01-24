# Meal Price Calculator

## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input, using an integer data type.

## Instructions

**Meal Price Calculator**

In this project, you will write a small program that asks the user for a type of meal (breakfast, lunch, or dinner) and then calculates the price based on predefined rates using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Meal Type Input**
    - Print "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)".
    - Capture the user's input for the meal type and store it in an integer variable called `mealType`.

3. **Calculate Price using Switch Statement**
    - Use a `switch` statement to calculate the price based on the meal type:
        - Case 1: Breakfast costs $5.00.
        - Case 2: Lunch costs $10.00.
        - Case 3: Dinner costs $15.00.
        - Default: Print "Invalid meal type entered".

4. **Print the Price**
    - Print "The price of your meal is $" followed by the calculated amount.

## Expected Output
```
Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
1
The price of your meal is $5.0
```

```
Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
2
The price of your meal is $10.0
```

```
Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
4
Invalid meal type entered
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use a `switch` statement to handle multiple conditions based on the user's input.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Switch Statement**: The `switch` statement is used to execute one block of code among many based on the value of a variable.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `switch` statement in Java. Happy coding!
