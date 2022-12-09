package ru.golovan.task4;

import java.util.Scanner;

/**
 * Необходимо реализовать фабричный метод для п.1
 */
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите градусы Цельсия: ");
        double value = sc.nextDouble();

        ConvertorFactory convertorFactory = new CelsiusConvertorFactory();

        // конвертация в Кельвины
        Convertor celsiusConvertor = convertorFactory.createConvertor(Measures.KELVIN);
        double resultK = celsiusConvertor.convert(value);
        System.out.println("Результат конвертации: " + resultK + celsiusConvertor.getResultName());

        // конвертация в Фаренгейты
        celsiusConvertor = convertorFactory.createConvertor(Measures.FAHRENHEIT);
        double resultF = celsiusConvertor.convert(value);
        System.out.println("Результат конвертации: " + resultF + celsiusConvertor.getResultName());

    }
}
