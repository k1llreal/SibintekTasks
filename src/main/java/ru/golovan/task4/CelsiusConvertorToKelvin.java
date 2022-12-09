package ru.golovan.task4;

public class CelsiusConvertorToKelvin implements Convertor {
    @Override
    public double convert(double celsiusValue) {
        return celsiusValue + 273.15;
    }

    @Override
    public String getResultName() {
        return " по Кельвину";
    }
}
