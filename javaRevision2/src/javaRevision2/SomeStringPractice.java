package javaRevision2;

public class SomeStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeStringPractice someStringPractice = new SomeStringPractice();
		System.out.println(someStringPractice.everyNth("Miracle", 2));
		System.out.println(someStringPractice.everyNth("abcdefg", 2));
		System.out.println(someStringPractice.everyNth("abcdefg", 3));
	}
	
	public String everyNth (String word, int N) {
		String newWord = "";
		
		for (int index = 0; index < word.length(); index+=N) {
			
			newWord += word.charAt(index);
			
		}
				
		return newWord;
	}

}
