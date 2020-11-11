public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("===== Witaj w programie Kalkulator v 0.1 =====");
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.chooseOperation();
        calculatorService.printResult();

    }
}
