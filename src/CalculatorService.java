import java.util.Scanner;

public class CalculatorService {

    double x;
    double y;

    Scanner scanner = new Scanner(System.in);

    public double chooseOperation() {

        System.out.println("Wprowadź x:");
        double x = scanner.nextInt();
        scanner.nextLine();
        operatorSelector();

    }


    private double operatorSelector() {
        System.out.println("Wybierz dostępne operacje: +, -, *, /");
        String parameter = scanner.nextLine();
        double result;
        switch (parameter) {
            case "+":

                result = addXY(x,y);
                break;
            case "-":
               // result =
                break;
            case "*":
              //  result =
                break;
            case "/":
                //result =
                break;
            default:
                System.out.println("Wybrano nieprawidłową operację !!! Spróbuj ponownie:");
                operatorSelector();
        } return result;

    }


    private void addXY(Parameters x, Parameters y) {
        System.out.println(x.setX(x); +y.getX());
    }

    private void minusXY(Parameters x, Parameters y) {
        System.out.println(x.getX() - y.getX());
    }

    private void multiplyXY(Parameters x, Parameters y) {
        System.out.println(x.getX() * y.getX());
    }

    private void divideXY(Parameters x, Parameters y) {
        System.out.println(x.getX() / y.getX());
    }
}