package test;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	static boolean canFormPalindrome(String str) {
		str = str.toUpperCase();

		char[] charArr = str.toCharArray();
		List<Character> uniqueCharacters = new ArrayList<Character>();

		for (int i = 0; i < charArr.length; i++) {
			if (uniqueCharacters.contains(charArr[i]))
				uniqueCharacters.remove((Character) charArr[i]);
			else
				uniqueCharacters.add((Character) charArr[i]);

		}
		int uniqueLength = uniqueCharacters.size();
//System.out.println(uniqueCharacters);
		if (charArr.length % 2 == 0 && uniqueLength == 0 || (charArr.length % 2 == 1 && uniqueLength == 1))
			return true;
		else
			return false;
	}

	public static boolean IsPalindrome(String str) {
		int length = str.length();

		for (int i = 0; i < length / 2; i++)
		{
			if (!str.substring(i, i + 1).equalsIgnoreCase(str.substring(length - 1 - i, length - i))) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	//	System.out.println(canFormPalindrome("NINNIT"));
		System.out.println(IsPalindrome("MkMMm"));
	}
}
