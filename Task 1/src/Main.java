import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        System.out.println("Выберите оператор:\n1) Сложение(+) \n2) Разность(-)\n3) Деление(/)\n4) Умножение(*)");
        int operator = new Scanner(System.in).nextInt();

        if(operator == 1){
            sum();
        } else if (operator == 2) {
            diff();
        } else if (operator == 3) {
            divide();
        } else if (operator == 4) {
            multiply();
        } else{
            System.out.println("Ошибка");
        }
    }

    private static void divide() {
        //todo дописать логику и печать результата
        double divide = a/b;
        System.out.println("Частное равно " + divide);
    }

    private static void diff() {
        //todo дописать логику и печать результата
        double diff = a-b;
        System.out.println("Разность равна " + diff);
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        double multiply = a*b;
        System.out.println("Произведение равно " + multiply);
    }

    private static void sum() {
        //todo дописать логику и печать результата
        double sum = a+b;
        System.out.println("Сумма равна " + sum);
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
