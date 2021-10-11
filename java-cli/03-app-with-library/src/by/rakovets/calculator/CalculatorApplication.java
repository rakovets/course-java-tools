package by.rakovets.calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        CalculatorApplication.run();
    }

    public static void run() {
        CalculatorController controller = new CalculatorController();
        boolean isRun = true;
        while (isRun) {
            controller.execute();
            if (controller.promptExit()) {
                isRun = false;
            }
        }
    }
}
