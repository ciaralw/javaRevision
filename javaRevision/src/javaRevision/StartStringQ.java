package javaRevision;

public class StartStringQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartStringQ startStringQ = new StartStringQ();
//		System.out.println(startStringQ.stringBegin("hi there Bob"));
//		System.out.println(startStringQ.stringBegin("hello there Bob"));
//		System.out.println(startStringQ.stringBegin("hiho Bob Bobson"));
//		System.out.println(startStringQ.stringBegin("Hi Bob"));
		System.out.println(startStringQ.stringBegin("hi there"));
		System.out.println(startStringQ.stringBegin("hi"));
		System.out.println(startStringQ.stringBegin("hello hi"));
	}

	public boolean stringBegin(String sentence) {
		boolean startsWith = sentence.startsWith("hi");
		return startsWith;	
	}
	
	public void stringBegin1() {
		
	}
}

//given a string return true if a string starts with hi