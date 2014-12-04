public class RomanNumerals {

	private static final int[] VALUES = { 9, 5, 4,1 };
	private static final String[] SYMBOLS = { "IX", "V", "IV","I" };

	public static String roman(int i) {
		StringBuilder r = new StringBuilder();
		for (int a = 0; a < VALUES.length; a++) {
			i = append(i, VALUES[a], SYMBOLS[a], r);
		}
		return r.toString();
	}

	private static int append(int i, int c, String n, StringBuilder r) {
		while (i >= c) {
			r.append(n);
			i -= c;
		}
		return i;
	}
}
