# Shopping Cart Calculation

## Objective
Learn how to perform basic arithmetic operations in Java through a real-life shopping scenario.

## Instructions

**Shopping Cart Calculation**

In this project, you will write a small program that calculates the total cost of items in a shopping cart, applies a discount, and calculates the final price.

**For you to do:**

1. **Create Variables**
    - Create float variables for the prices of three items: `item1`, `item2`, and `item3`. Assign the following values to these variables:
      ```java
      float item1 = 30.0f;
      float item2 = 20.0f;
      float item3 = 40.0f;
      ```

2. **Calculate Total Cost**
    - Add the prices of the three items to calculate the total cost and store the result in a variable called `totalCost`.

3. **Apply Discount**
    - Create a float variable called `discountRate` and set it to 0.1 (representing a 10% discount).
    - Calculate the discount amount by multiplying `totalCost` by `discountRate` and store the result in a variable called `discountAmount`.
    - Subtract the `discountAmount` from `totalCost` to get the final price and store it in a variable called `finalPrice`.

4. **Print the Results**
    - Print the total cost, discount amount, and final price in the following format:


## Expected Output
```
Total Cost: $90.0
Discount Amount: $9.0
Final Price: $81.0
```

## Tips
- Remember to use `System.out.println` to print the results.
- Ensure your variables are declared and assigned correctly.
- Float variables should be suffixed with an `f` (e.g., `10.0f`).

## Additional Information
- **Float Variables**: A float variable can hold decimal numbers.
- **Arithmetic Operations**: Use the `+`, `-`, and `*` operators to perform addition, subtraction, and multiplication respectively.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the variables are assigned the correct values and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to perform basic arithmetic operations in Java. Happy coding!
