# Thirsty or Sleepy

## Objective
Learn how to use the `Scanner` class in Java to capture boolean input from the user and use logical operators to determine an appropriate drink based on their state of thirst and sleepiness.

## Instructions

**Thirsty or Sleepy**

In this project, you will write a small program that asks the user if they are thirsty and if they are sleepy, and then suggests a drink based on their responses.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Boolean Inputs**
    - Print "Are you thirsty? (true/false)".
    - Capture the user's input for thirst and store it in a variable called `isThirsty`.
    - Print "Are you sleepy? (true/false)".
    - Capture the user's input for sleepiness and store it in a variable called `isSleepy`.

3. **Determine the Drink**
    - If the user is thirsty and not sleepy, set `drink` to "water".
    - If the user is thirsty and sleepy, set `drink` to "coffee".
    - If the user is not thirsty and sleepy, set `drink` to "tea".
    - Otherwise, set `drink` to "nothing".

4. **Print the Drink Suggestion**
    - Print "Looks like you need to drink ___" with the appropriate drink.

## Expected Output
```
Are you thirsty? (true/false)
true
Are you sleepy? (true/false)
false
Looks like you need to drink water
```

```
Are you thirsty? (true/false)
true
Are you sleepy? (true/false)
true
Looks like you need to drink coffee
```

```
Are you thirsty? (true/false)
false
Are you sleepy? (true/false)
true
Looks like you need to drink tea
```

```
Are you thirsty? (true/false)
false
Are you sleepy? (true/false)
false
Looks like you need to drink nothing
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
