# Instructor Responsibility

## Objective
Learn how to use the `Scanner` class in Java to capture string input from the user and use the switch statement to determine the responsibility of an instructor.

## Instructions

**Instructor Responsibility**

In this project, you will write a small program that asks the user for the name of an instructor and then determines their responsibility based on the input using a switch statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Instructor Name**
    - Print "Enter name of the instructor".
    - Capture the user's input for the instructor's name and store it in a variable called `instructorName`.

3. **Determine Responsibility**
    - Use a switch statement to determine the responsibility based on the instructor's name:
        - If the name is "Asghar", set `responsibility` to "Will take care of Java Assignment".
        - If the name is "Moazzam", set `responsibility` to "Will take care of SDLC Assignment".
        - If the name is "Weqas", set `responsibility` to "Will take care of Selenium Assignment".
        - If the name is "Asel", set `responsibility` to "Will take care of every Assignment".
        - For any other name, set `responsibility` to "Invalid instructor selected".

4. **Print the Responsibility**
    - Print the responsibility.

## Expected Output
```
Enter name of the instructor
Asghar
Will take care of Java Assignment
```

```
Enter name of the instructor
John
Invalid instructor selected
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use the switch statement to determine the responsibility based on the instructor's name.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Switch Statement**: Use the switch statement to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and switch statements in Java. Happy coding!
