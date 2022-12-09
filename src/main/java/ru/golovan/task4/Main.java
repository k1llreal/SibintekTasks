package ru.golovan.task4;

import java.util.Scanner;

/**
 * Необходимо написать в соответствии с ООП
 * реализацию функционала конвертации градусов Цельсия в Кельвины и Фаренгейты
 * и возможностью расширения реализаций конвертаций градусов Цельсия в другие единицы измерения
 */
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите градусы Цельсия: ");
        double value = sc.nextDouble();

        // конвертация в Кельвины
        Convertor celsiusConvertor = new CelsiusConvertorToKelvin();
        double resultK = celsiusConvertor.convert(value);
        System.out.println("Результат конвертации: " + resultK + celsiusConvertor.getResultName());

        // конвертация в Фаренгейты
        celsiusConvertor = new CelsiusConvertorToFahrenheit();
        double resultF = celsiusConvertor.convert(value);
        System.out.println("Результат конвертации: " + resultF + celsiusConvertor.getResultName());

    }
}
