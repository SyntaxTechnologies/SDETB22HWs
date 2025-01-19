# Weather Activity Suggestion

## Objective
Learn how to use the `Scanner` class in Java to capture boolean and numerical input from the user and use nested `if-else` conditions to provide activity suggestions based on the weather.

## Instructions

**Weather Activity Suggestion**

In this project, you will write a small program that asks the user about the weather and the temperature, and then provides an activity suggestion based on the input.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Weather Information**
   - Declare a boolean variable `isSunny`.
   - Print "Is it sunny outside? (true/false)".
   - Capture the user's input using the `Scanner` object and store it in the `isSunny` variable.

3. **Capture Temperature Information**
   - Declare an integer variable `temperature`.

4. **Provide Activity Suggestions**
   - Use an `if-else` statement to check the value of `isSunny`.
   - If `isSunny` is `true`, print "It is a sunny day, I should go somewhere!" and ask for the temperature.
      - Print "What is the temperature outside?".
      - Capture the user's input using the `Scanner` object and store it in the `temperature` variable.
      - Use another `if-else` statement to check the value of `temperature`.
         - If `temperature` is higher than 85, print "I am going to the beach!".
         - Otherwise, print "I am going to the park!".
   - If `isSunny` is `false`, print "I stay home and practice Java".

## Expected Output
```
Example Output:
Is it sunny outside? (true/false)
true
It is a sunny day, I should go somewhere!
What is the temperature outside?
90
I am going to the beach!
```

```
Example Output:
Is it sunny outside? (true/false)
false
I stay home and practice Java!
```

```
Example Output:
Is it sunny outside? (true/false)
true
It is a sunny day, I should go somewhere!
What is the temperature outside?
75
I am going to the park!
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use `if-else` conditions to provide activity suggestions based on the weather and temperature.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use nested `if-else` statements to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and nested `if-else` conditions in Java. Happy coding!
