package sk.kosickaakademia.deco.regexes;

import java.util.regex.Pattern;

public class WithRegex {
    public static void main(String[] args) {
        System.out.println(isDigit("gs8"));
    }

    public static boolean isDigit(String s) {
        return Pattern.matches("\\d",s);

    }
}
