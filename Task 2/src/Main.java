import java.util.Scanner;

public class Main {

    static double firstNumber = inputNumber();

    public static void main(String[] args) {
        trueOrFalse();
    }

    private static double inputNumber(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextDouble();
    }

    private static void trueOrFalse(){
        System.out.println(firstNumber % 2 == 0);
    }
}
