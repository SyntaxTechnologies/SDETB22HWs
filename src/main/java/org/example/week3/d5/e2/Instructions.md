# Personal Budgeting Helper

## Objective
Learn how to use the `Scanner` class in Java to capture string and numerical input from the user and use logical operators to analyze their monthly expenses.

## Instructions

**Personal Budgeting Helper**

In this project, you will write a small program that helps a user manage their personal budget by comparing their expenses in different categories.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Monthly Expenses**
   - Print "Please enter your monthly rent expense".
   - Capture the user's input for the rent expense and store it in a variable called `rentExpense`.
   - Print "Please enter your monthly food expense".
   - Capture the user's input for the food expense and store it in a variable called `foodExpense`.
   - Print "Please enter your monthly transportation expense".
   - Capture the user's input for the transportation expense and store it in a variable called `transportationExpense`.
   - Print "Please enter your monthly entertainment expense".
   - Capture the user's input for the entertainment expense and store it in a variable called `entertainmentExpense`.

3. **Analyze Expenses**
   - If `rentExpense` is greater than `foodExpense` **and** `transportationExpense` is greater than `entertainmentExpense`, output "You are prioritizing essentials well."
   - If `rentExpense` is greater than `foodExpense` **or** `transportationExpense` is greater than `entertainmentExpense`, output "You are on the right track, but could improve."
   - If `rentExpense` is not greater than `foodExpense` **and** `transportationExpense` is not greater than `entertainmentExpense`, output "You need to rethink your spending priorities."

## Expected Output
```
Please enter your monthly rent expense
1200
Please enter your monthly food expense
600
Please enter your monthly transportation expense
300
Please enter your monthly entertainment expense
200
Output: You are prioritizing essentials well.
```

```
Please enter your monthly rent expense
1200
Please enter your monthly food expense
800
Please enter your monthly transportation expense
300
Please enter your monthly entertainment expense
400
Output: You are on the right track, but could improve.
```

```
Please enter your monthly rent expense
1000
Please enter your monthly food expense
1200
Please enter your monthly transportation expense
200
Please enter your monthly entertainment expense
300
Output: You need to rethink your spending priorities.
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use logical operators (`&&`, `||`, `!`) to make the necessary comparisons.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Logical Operators**: Use logical operators to combine multiple conditions in your comparisons.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and logical operators in Java. Happy coding!
