# Gender and Age Classification

## Objective
Learn how to use the `Scanner` class in Java to capture string and numerical input from the user and use nested `if-else` conditions to classify the user based on gender and age.

## Instructions

**Gender and Age Classification**

In this project, you will write a small program that asks the user for their gender and age, and then classifies them based on the input.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Gender Information**
    - Print "Please enter your gender: M or F".
    - Capture the user's input using the `Scanner` object and store it in a variable called `gender`.

3. **Capture Age Information**
    - Print "Please enter your age".
    - Capture the user's input using the `Scanner` object and store it in a variable called `age`.

4. **Classify Based on Gender and Age**
    - Use an `if-else` statement to check the value of `age`.
    - If `age` is above 25:
        - If `gender` is "F", print "Woman".
        - Otherwise, print "Man".
    - If `age` is 25 or below:
        - If `gender` is "F", print "Girl".
        - Otherwise, print "Boy".

## Expected Output
```
Example Output:
Please enter your gender: M or F
M
Please enter your age
30
Man
```

```
Example Output:
Please enter your gender: M or F
M
Please enter your age
20
Boy
```

```
Example Output:
Please enter your gender: M or F
F
Please enter your age
28
Woman
```

```
Example Output:
Please enter your gender: M or F
F
Please enter your age
18
Girl
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use `if-else` conditions to classify based on gender and age.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use nested `if-else` statements to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and nested `if-else` conditions in Java. Happy coding!
