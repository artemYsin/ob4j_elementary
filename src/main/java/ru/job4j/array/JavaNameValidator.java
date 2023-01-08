package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && !Character.isUpperCase(name.codePointAt(0)) && !Character.isDigit(name.codePointAt(0));
        if (valid) {
            for (int i = 1; i < name.length(); i++) {
                int codeNumber = name.codePointAt(i);
                if (!isSpecialSymbol(codeNumber) && !isUpperLatinLetter(codeNumber) && !isLowerLatinLetter(codeNumber) && !Character.isDigit(codeNumber)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
