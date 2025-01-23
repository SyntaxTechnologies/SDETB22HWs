# Loan Eligibility Checker

## Objective
Learn how to use the `Scanner` class in Java to capture boolean and numerical input from the user and use conditional statements to determine loan eligibility based on credit score.

## Instructions

**Loan Eligibility Checker**

In this project, you will write a small program that asks the user if they need a loan, and if so, checks their credit score to determine their loan eligibility.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Check Loan Requirement**
    - Print "Do you need a loan? (true/false)".
    - Capture the user's input using the `Scanner` object and store it in a boolean variable called `needsLoan`.

3. **Check Credit Score**
    - If `needsLoan` is true:
        - Print "What is your credit score?".
        - Capture the user's input using the `Scanner` object and store it in an integer variable called `creditScore`.

4. **Determine Eligibility**
    - Use conditional statements to determine the user's loan eligibility based on their credit score:
        - If `creditScore` is below 600, set eligibility to "Not eligible".
        - If `creditScore` is between 600 and 700 inclusive, set eligibility to "Maybe eligible".
        - If `creditScore` is between 701 and 800 inclusive, set eligibility to "Eligible".
        - If `creditScore` is higher than 800, set eligibility to "Definitely eligible".
    - If `needsLoan` is false, set eligibility to "Unknown".

5. **Print Eligibility**
    - Print "The eligibility is ____" with the corresponding eligibility status.

## Expected Output
```
Do you need a loan? (true/false)
true
What is your credit score?
650
The eligibility is Maybe eligible
```

```
Do you need a loan? (true/false)
false
The eligibility is Unknown
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use conditional statements to determine loan eligibility based on credit score.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use conditional statements to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and conditional statements in Java. Happy coding!
