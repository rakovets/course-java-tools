package by.rakovets.calculator;

import java.util.Scanner;

public class CalculatorController {
    private final CalculatorView view = new CalculatorView();
    private final CalculatorModel model = new CalculatorModel();
    private final Scanner scanner = new Scanner(System.in);

    public boolean promptExit() {
        view.printExitQuestion();
        return scanner.next().equalsIgnoreCase("yes");
    }

    public void execute() {
        try {
            int actionNumber = requestActionNumber();
            double a = requestOperand();
            double b = requestOperand();

            double result = 0.0;
            switch (actionNumber) {
                case 1:
                    result = model.add(a, b);
                    break;
                case 2:
                    result = model.subtract(a, b);
                    break;
                case 3:
                    result = model.multiply(a, b);
                    break;
                case 4:
                    result = model.divide(a, b);
                    break;
            }
            view.printResult(result);
        } catch (Exception e) {
            view.printError(e.getMessage() == null ? "Wrong input" : e.getMessage());
        }
    }

    private int requestActionNumber() {
        view.printActions();
        return scanner.nextInt();
    }

    private double requestOperand() {
        view.printOperandQuestion();
        return scanner.nextDouble();
    }
}
