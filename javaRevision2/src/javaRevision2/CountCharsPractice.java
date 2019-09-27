package javaRevision2;

public class CountCharsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCharsPractice countCharsPractice = new CountCharsPractice();
//		System.out.println(countCharsPractice.countXX("abcxx"));
//		System.out.println(countCharsPractice.countXX("xxx"));
//		System.out.println(countCharsPractice.countXX("xxxx"));
		
		if((countCharsPractice.countXX("abcxx") == 5) && ((countCharsPractice.countXX("xxx")) == 3) && ((countCharsPractice.countXX("xxxx")) == 4)){
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong");
		}
	}

	public int countXX(String word) {
		return word.length();
	}
	
	
}
