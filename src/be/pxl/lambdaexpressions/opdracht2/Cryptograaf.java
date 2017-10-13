package be.pxl.lambdaexpressions.opdracht2;

public class Cryptograaf {

	public Cryptograaf() {
		// TODO Auto-generated constructor stub
	}

	public static String encryptFirst(String text) {
		/*
		 * return new Bericht(text).encrypt(new Encryptie() {
		 * 
		 * @Override public String apply(String s) { return new
		 * StringBuilder(s).reverse().toString(); } });
		 */

		return new Bericht(text).encrypt((s) -> new StringBuilder(s).reverse().toString());

	}

	public static String encryptSimple(String text) {
		return new Bericht(text).encrypt(new Encryptie() {

			@Override
			public String apply(String s) {
				s = s.toUpperCase();
				char[] characters = s.toCharArray();
				String result = "";
				for (char c : characters) {
					int charValue = Character.getNumericValue(c);
					if (charValue >= 10 && charValue <= 35) {
						result += charValue;
					} else {
						result += c;
					}
					result += "-";
				}
				result = result.substring(0, result.length() - 1);
				return result;
			}
		});
	}

	public static String encryptLambda(String text) {
		return new Bericht(text).encrypt((s) -> {
			s = s.toLowerCase();
			char[] characters = s.toCharArray();
			String result = "";
			for (char c : characters) {
				int charValue = (int) c;
				if (charValue >= 97 && charValue <= 122) {
					charValue += s.length();
					if (charValue > 122) {
						charValue = charValue - 122 + 96;
					}
					result += (char) charValue;
				} else {
					result += c;
				}
			}
			return result;
		});
	}
}
