# Number Classification

## Objective
Learn how to use the `Scanner` class in Java to capture numerical input from the user and use nested `if-else` conditions to classify the number as even or odd and further classify its size.

## Instructions

**Number Classification**

In this project, you will write a small program that asks the user for a number, determines if it is even or odd, and then checks if the number is greater than 1000 to provide further classification.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Number Information**
    - Print "Please enter a number".
    - Capture the user's input using the `Scanner` object and store it in a variable called `number`.

3. **Classify the Number**
    - Use an `if-else` statement to check if the number is even or odd.
    - If the number is even:
        - Print "Value is even".
        - Use another `if-else` statement to check if the number is greater than 1000.
            - If it is, print "Even value is large".
            - Otherwise, print "Even value is just right".
    - If the number is odd:
        - Print "Value is odd".
        - Use another `if-else` statement to check if the number is greater than 1000.
            - If it is, print "Odd value is large".
            - Otherwise, print "Odd value is just right".

## Expected Output
```
Example Output: for 33
Please enter a number
33
Value is odd
Odd value is just right
```

```
Example Output: for 1200
Please enter a number
1200
Value is even
Even value is large
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use `if-else` conditions to classify the number and its size.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use nested `if-else` statements to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and nested `if-else` conditions in Java. Happy coding!
