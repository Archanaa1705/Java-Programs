import java.util.Arrays;

public class ReversalString {

	public static void main(String[] args) {
		String word="welcome";
		System.out.println("the original word: "+word);
		reverse(word);
		}
	private static String reverse(String word) {
		
		int wordlength=word.length();
		char[]letters =new char[word.length()];
		
		int lettersindex=0;
		int i=0;
		for(i=wordlength-1;i>=0;i--) {
			
			letters[lettersindex]=word.charAt(i);
			lettersindex++;
			
		}
		System.out.println(letters);
		return word;
		
	}
	

}
