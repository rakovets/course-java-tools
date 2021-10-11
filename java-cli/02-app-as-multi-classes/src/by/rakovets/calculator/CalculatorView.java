package by.rakovets.calculator;

public class CalculatorView {
    public void printExitQuestion() {
        System.out.println("You want to exit (yes)?");
    }

    public void printActions() {
        System.out.println(
                "Select an action and enter its number:\n" +
                        "1. Addition\n" +
                        "2. Subtraction\n" +
                        "3. Multiplication\n" +
                        "4. Division"
        );
    }

    public void printError(String errorDescription) {
        System.out.println("You have error: " + errorDescription);
    }

    public void printOperandQuestion() {
        System.out.print("Enter operand: ");
    }

    public void printResult(double result) {
        System.out.printf("Result: %.2f\n", result);
    }
}
