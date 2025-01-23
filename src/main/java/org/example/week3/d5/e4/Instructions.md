# Weekend Subject Planner

## Objective
Learn how to use the `Scanner` class in Java to capture boolean input from the user and use a conditional statement with logical operators to determine the subject to study.

## Instructions

**Weekend Subject Planner**

In this project, you will write a small program that asks the user if it is the weekend and if they are available, and then assigns a subject to study based on their responses.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Boolean Inputs**
   - Print "Is it weekend? (true/false)".
   - Capture the user's input for whether it is the weekend and store it in a variable called `isWeekend`.
   - Print "Are you available? (true/false)".
   - Capture the user's input for whether they are available and store it in a variable called `isAvailable`.

3. **Determine the Subject**
   - If it is the weekend and the user is available, set `subject` to "Java".
   - If it is not the weekend and the user is available, set `subject` to "manual testing".
   - If the user is not available, set `subject` to "no subject".

4. **Print the Subject**
   - Print "Today you will be learning ____" with the appropriate subject.

## Expected Output
```
Is it weekend? (true/false)
true
Are you available? (true/false)
true
Today you will be learning Java
```

```
Is it weekend? (true/false)
false
Are you available? (true/false)
true
Today you will be learning manual testing
```

```
Is it weekend? (true/false)
true
Are you available? (true/false)
false
Today you will be learning no subject
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use a conditional statement with logical operators to determine the subject based on the user's inputs.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and conditional statements with logical operators in Java. Happy coding!