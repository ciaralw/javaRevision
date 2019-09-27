package javaRevision2;

import java.util.ArrayList;

public class ReturnPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnPractice returnPractice = new ReturnPractice();
		System.out.println(returnPractice.returnInt());
		System.out.println(returnPractice.returnString());		
		System.out.println(returnPractice.returnSum(5,2));	
		System.out.println(returnPractice.returnArray("Hi","There"));	
	}

	public int returnInt() {
		return 42;
	}
	
	public String returnString() {
		return "Hello World";
	}
	
	public int returnSum(int value1, int value2) {
		//int sum = value1 + value2;
		//return sum;
		return value1 + value2;
	}
	
	public ArrayList<String> returnArray(String string1, String string2) {
		ArrayList<String> myString = new ArrayList<String>();
			myString.add(string1);
			myString.add(string2);	
			
		return myString;		
	}
}
