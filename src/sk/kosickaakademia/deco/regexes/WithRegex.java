package sk.kosickaakademia.deco.regexes;

import java.util.regex.Pattern;

public class WithRegex {
    public static void main(String[] args) {
        System.out.println(isDigit("gs8"));
    }
    /**method compares parameter String with pattern*/
    public static boolean isDigit(String s) {
        return Pattern.matches("\\d",s);

    }
}
