import java.util.Arrays;

public class DuplicateChararcters {

	public static void main(String[] args) {
		
		String sentence="Finding duplicates here";
		sentence=sentence.replaceAll(" ","");
		String characters="";
		
		String duplicates="";
		System.out.println(sentence);
		
		for (int i=0;i<sentence.length();i++) {
			
			String  current=Character.toString(sentence.charAt(i));
			
			if (characters.contains(current)) {
				if(!duplicates.contains(current)) {
					
				
				
				duplicates+=current+",";
				}
			}
			characters+=current;
		}System.out.println("The duplicate letters: "+duplicates);
		
	}

}
