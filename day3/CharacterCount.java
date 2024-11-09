package day3;

public class CharacterCount {
	public static void countCharacters (String str) {
		int lowercaseCount = 0;
		int uppercaseCount = 0;
		int specialCharCount = 0;
		
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if(Character.isLowerCase(ch)) {
				lowercaseCount++;
			} else if (! Character.isLetterOrDigit(ch))
			{
				specialCharCount++;
			}
			
		}
		
		System.out.println("Uppercase letters: " + uppercaseCount);
		System.out.println("Lowercase letters: " + lowercaseCount);
		System.out.println("Specialcase letters: " + specialCharCount);
	}

	public static void main(String[] args) {
		String input = "Hello World! 123";
		countCharacters(input);

	}

}
