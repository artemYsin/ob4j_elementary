package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollars.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 150;
        expected = 2.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 2.1. Test result : " + passed);
    }
}
