import java.util.Scanner;

public class CalculatorService {

    Scanner scanner = new Scanner(System.in);
    Parameters number = new Parameters();
    double x;
    double y;
    double result;


    public double chooseOperation() {
        setX();
        operatorSelector();
        return result;
    }

    private void setX() {
        System.out.println("Wprowadź x:");
        x = scanner.nextDouble();
        number.setX(x);
        scanner.nextLine();
    }

    private void setY() {
        System.out.println("Wprowadź y:");
        y = scanner.nextDouble();
        number.setY(y);
        scanner.nextLine();
        scanner.close();
    }

    private double operatorSelector() {
        System.out.println("Wybierz dostępne operacje: +, -, *, /");
        String parameter = scanner.nextLine();

        switch (parameter) {
            case "+":
                setY();
                result = addXY();
                break;
            case "-":
                setY();
                result = minusXY();
                break;
            case "*":
                setY();
                result = multiplyXY();
                break;
            case "/":
                setY();
                result = divideXY();
                break;
            default:
                System.out.println("Wybrano nieprawidłową operację !!! Spróbuj ponownie:");
                operatorSelector();
        }
        return result;

    }

    private double addXY() {
        return number.getX() + number.getY();
    }

    private double minusXY() {
        return number.getX() - number.getY();
    }

    private double multiplyXY() {
        return number.getX() * number.getY();
    }

    private double divideXY() {
        return number.getX() / number.getY();
    }

    public void printResult() {
        System.out.println("Wynik: " + result);
    }
}