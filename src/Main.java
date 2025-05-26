import java.util.Scanner;
class Calculator {
    private static Calculator instance = new Calculator();
    private Calculator() {
    }

    public static Calculator getInstance() {
        return instance;
    }

    public double calculate(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Y не может быть нулевым.");
        }
        return (2 * x + 3) / y;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите х: ");
        double x = input.nextDouble();
        System.out.println("Введите y: ");
        double y = input.nextDouble();
        double result = calculator.calculate(x, y);
        System.out.println("Результат: " + result);
    }
}