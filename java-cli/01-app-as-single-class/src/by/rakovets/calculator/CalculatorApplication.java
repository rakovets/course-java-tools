package by.rakovets.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        while (isRun) {
            try {
                System.out.println(
                        "Select an action and enter its number:\n" +
                                "1. Addition\n" +
                                "2. Subtraction\n" +
                                "3. Multiplication\n" +
                                "4. Division"
                );
                int actionNumber = scanner.nextInt();
                System.out.print("Enter operand: ");
                double a = scanner.nextDouble();
                System.out.print("Enter operand: ");
                double b = scanner.nextDouble();
                double result = 0.0;
                switch (actionNumber) {
                    case 1:
                        result = a + b;
                        break;
                    case 2:
                        result = a - b;
                        break;
                    case 3:
                        result = a * b;
                        break;
                    case 4:
                        result = a / b;
                        break;
                }
                System.out.printf("Result: %.2f\n", result);
            } catch (Exception e) {
                System.out.println("You have error: " + (e.getMessage() == null ? "Wrong input" : e.getMessage()));
            }
            System.out.println("You want to exit (yes)?");
            if (scanner.next().equalsIgnoreCase("yes")) {
                isRun = false;
            }
        }
    }
}
