package examples;

public class ReverseOfStringExamples {

	public static void main(String[] args) {
		String s = "0987654321";
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length / 2; i++) {
			// swap element left to right and from rightmost to left
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = temp;
		}

		System.out.println(charArray);

	}

}
