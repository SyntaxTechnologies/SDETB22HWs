# Exercise 65: Print Series of Numbers in Reverse Using For Loop

## Objective
Learn how to use the `for` loop in Java to iterate and print a series of numbers in reverse based on user input.

## Instructions

**Print Series of Numbers in Reverse Using For Loop**

In this project, you will write a small program that prints a series of numbers starting at one less than a user-defined value `x` and ending at 0.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Prompt the User for Input**
    - Print "In: " to prompt the user to enter a value for `x`.
    - Read the user input and store it in an integer variable `x`.

3. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to `x - 1` and decrements `i` by 1 each iteration.

4. **Use the For Loop to Print the Series in Reverse**
    - Ensure the loop continues as long as `i` is greater than or equal to 0.
    - Inside the loop:
        - Print the value of `i` followed by a space.

## Expected Output
```
In: 7
6 5 4 3 2 1 0

In: 12
11 10 9 8 7 6 5 4 3 2 1 0

In: 20
19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
```

## Tips
- Ensure your `for` loop has the correct condition to avoid infinite loops.
- Remember to decrement the `i` variable by 1 to ensure the loop terminates correctly.

## Additional Information
- **For Loop**: A `for` loop repeatedly executes a block of statements a specified number of times.
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the loop condition and the decrement statement are correct.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `for` loop in Java. Happy coding!
