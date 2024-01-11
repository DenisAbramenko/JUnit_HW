package org.example;

public class StringUtils {

    public static boolean isEmpty(final String subject) {
        return subject == null || subject.replaceAll("\\s", "").isEmpty();
    }

    public static double toDouble(String source) {
        if (source == null) {
            return Double.NaN;
        }
        return Double.parseDouble(source);
    }

    public static String fromDouble(double source) {
        return String.valueOf(source);
    }
}