package Calculate;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:");
        double a = in.nextDouble();
        System.out.println("Введите число b:");
        double b = in.nextDouble();
        Calculator calculator = new Calculator(new Multiplier());
        calculator.calc(a,b);
        Calculator calculator1 = new Calculator(new Divider());
        calculator1.calc(a,b);
        
    }
}