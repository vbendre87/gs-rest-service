package hello.service;

import org.springframework.stereotype.Component;

@Component
public class WordService {

	public Boolean isPalindrome(final String word) {
		Boolean isPalindrome = false; 
		String reverseString = "";
		if(word != null) { 
			for(int i = word.length() - 1; i >=0; i--) {
				reverseString += word.charAt(i);
			}
			if(word.equalsIgnoreCase(reverseString)) {
				isPalindrome = true;
			}
		}
		return isPalindrome;
	}
	
	public Boolean isAnagramPalindrome(final String word) {
		int oddOccur = 0;
		int[] count = new int[256];
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			count[ch]++;
		}
		
		for(int cnt : count)
		{
			if(oddOccur > 1)
			{
				return false;
			}
			if(cnt%2 == 1)
			{
				oddOccur++;
			}
		}
		return true;
	}
}
