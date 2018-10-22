package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hello.service.WordService;
import hello.service.model.Word;

@RestController
public class WordController {
    
	@Autowired 
	private WordService service;
	
	@GetMapping("/words/{word}")
	public Word processWord(@PathVariable String word) {
		final Word processedWord = new Word();
		processedWord.setWord(word);
		processedWord.setAnagramOfPalindrome(service.isAnagramPalindrome(word));
		processedWord.setPalindrome(service.isPalindrome(word));
		return processedWord;
	}
}
