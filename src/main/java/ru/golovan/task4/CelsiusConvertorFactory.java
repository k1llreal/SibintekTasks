package ru.golovan.task4;

public class CelsiusConvertorFactory implements ConvertorFactory {
    @Override
    public Convertor createConvertor(Measures measures) {
        Convertor convertor = null;
        switch (measures) {
            case KELVIN:
                convertor = new CelsiusConvertorToKelvin();
                break;
            case FAHRENHEIT:
                convertor = new CelsiusConvertorToFahrenheit();
                break;
            default:
                System.out.println("Unknown name of convert result");
        }
        return convertor;
    }
}
