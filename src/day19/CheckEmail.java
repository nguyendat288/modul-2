package day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public CheckEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public static boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
