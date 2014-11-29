public class RomanNumerals {

    public static String roman(int i) {
        String r = "";
        while (i > 0) {
            if (i % 6 == 0) {
                r += "VI";
                i -= 6;
            } else if (i % 5 == 0) {
                r += "V";
                i -= 5;
            } else if (i % 4 == 0) {
                r += "IV";
                i -= 4;
            } else {
                r += "I";
                i--;
            }
        }
        return r;
    }

}
