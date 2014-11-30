public class RomanNumerals {

	public static String roman(int i) {
		String r = "";
		while (i > 0) {
			if (i % 100 == 10) {
				r = "X" + r;
				i -= 10;
			} else if (i % 10 == 9) {
				r = "IX" + r;
				i -= 9;
			} else if (i % 10 == 6) {
				r = "VI" + r;
				i -= 6;
			} else if (i % 10 == 5) {
				r += "V";
				i -= 5;
			} else if (i % 10 == 4) {
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
