package hello.service.model;

public class Word {
	private String word;
	private Boolean palindrome;
	private Boolean anagramOfPalindrome;

	public Word() {
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Boolean isPalindrome() {
		return palindrome;
	}
	public void setPalindrome(Boolean isPalindrome) {
		this.palindrome = isPalindrome;
	}
	public Boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}
	public void setAnagramOfPalindrome(Boolean isAnagramOfPalindrome) {
		this.anagramOfPalindrome = isAnagramOfPalindrome;
	}
}
