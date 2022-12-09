package ru.golovan.task4;

public class CelsiusConvertorToFahrenheit implements Convertor {
    @Override
    public double convert(double celsiusValue) {
        return celsiusValue * 1.8 + 32;
    }

    @Override
    public String getResultName() {
        return " по Фаренгейту";
    }
}
