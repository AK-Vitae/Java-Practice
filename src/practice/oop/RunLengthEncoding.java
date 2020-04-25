package practice.oop;

public class RunLengthEncoding {

    public static String encode(String original) {
        int count = 0;
        String encoded = "";
        for (int i = 0; i < original.length(); i++) {
            count = 1;
            while (i + 1 < original.length() && original.charAt(i) == original.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                encoded = encoded + original.charAt(i);
            } else {
                encoded = encoded + count + original.charAt(i);
            }
        }
        return encoded;
    }

    public static String decode(String original) {

        if (original.length() == 1) {
            return original;
        }
        if (original.length() > 1) {
            char first = original.charAt(0);
            char second = original.charAt(1);
            if (Character.isDigit(first)) {
                if (Character.getNumericValue(first) == 1) {
                    return Character.toString(second) + decode(original.substring(2));
                } else if (Character.getNumericValue(first) < 1) {
                    return Character.toString(first) + decode(original.substring(1));
                } else if (Character.getNumericValue(first) > 1) {
                    first--;
                    String temp = Character.toString(first) + Character.toString(second) + original.substring(1);
                    return decode(temp);
                }
            } else {
                return Character.toString(first) + decode(original.substring(1));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String test = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
        String encoded = (encode(test));
        System.out.println(encoded);
        System.out.println(decode(encoded));

    }
}
