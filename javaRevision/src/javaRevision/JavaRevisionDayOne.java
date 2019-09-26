package javaRevision;

public class JavaRevisionDayOne {
	
	private int a = 4;
	private int b = 5;
	

	public static void main(String[] args) {
		JavaRevisionDayOne javaRevisionDayOne = new JavaRevisionDayOne();
		//javaRevisionDayOne.printConditions();
		//javaRevisionDayOne.forConditions();
		//javaRevisionDayOne.whileConditions();
		//javaRevisionDayOne.doWhileConditions();
		//javaRevisionDayOne.switchConditions();
		javaRevisionDayOne.switchStringConditions();
	}
	
	public void printConditions() {
		//if statements
		if(a==b) {
			System.out.println("A equals B \n");
		}
		else if(a!=b) {
			System.out.println("A is not equal to B \n");
		}
		else {
			System.out.println("A and B are figments of your imagination \n");
		}
		
		if(a<b) {
			System.out.println("A is less than B \n");
		}
		else if(a>b) {
			System.out.println("A is greater than B \n");
		}
		else {
			System.out.println("A and B are figments of your imagination \n");
		}
		
		if(a<=4) {
			System.out.println("A is less than or equal to 4 \n");
		}
		else if(b>=6) {
			System.out.println("B is greater than or equal to 6 \n");
		}
		else {
			System.out.println("A and B are figments of your imagination \n");
		}
		
		if(a>b || a<b) {
			System.out.println("A is greater than or less than B \n");
		}
		else {
			System.out.println("A is equal to B \n");
		}
		
		if(3<a && a<6) {
			System.out.println("A is either 4 or 5 \n");
		}
		else {
			System.out.println("A is not equal to 4 or 5 \n");
		}
		
		if(a<=2) {
			System.out.println("A is less than or equal to 4 \n");
		}
		else if(b>=6) {
			System.out.println("B is greater than or equal to 6 \n");
		}
		else {
			System.out.println("A and B are figments of your imagination \n");
		}
		
		//ternary operator
		String whatIsA = (a<=3) ? "A is 3 or less" : "A is 4 or more";
		System.out.println(whatIsA);
		
	}
	
	public void forConditions(){
		//for loop
		for (int index = 0; index < 10; index++) {
			System.out.println("Index: " + index);
		}
		
		System.out.println("\n");
		
		//for loop to print evn numbers, add 2 each time rather than using an incrementor
		
		for (int index = 0; index < 10; index+=2) {
			System.out.println("Index: " + index);
		}
		
		System.out.println("\n");
		
		//for loop
		for (int index = 10; index >= 0; index--) {
			System.out.println("Index: " + index);
		}

		}
	
	public void whileConditions() {
		//while loop
		int index = 0;
		while(index < 10) {
			System.out.println("Index is less than 10, its: " + index);
			index++;
		}
	}
	
	public void doWhileConditions() {
		//do/while loop
		int index = 12;
		do {
			System.out.println("Index is less than 10, its: " + index);
			index++;			
		}
		while(index < 10);
	}
	
	public void switchConditions() {
		//switch statement - doesn't matter if the cases are in order or not, will evaluate from top down
		int day = 4;
		//int day = 8;
		switch (day) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			//break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
			break;
		default:
			System.out.println("Das ist kein tag der woche");
		}
	}
	
	public void switchStringConditions() {
		//switch statement with strings as the cases (instead of numbered cases)
		String day = "Saturday";
		//String day = "German days";
		switch (day) {
		case "Monday":
			System.out.println("Montag");
			break;
		case "Tuesday":
			System.out.println("Dienstag");
			break;
		case "Wednesday":
			System.out.println("Mittwoch");
			break;
		case "Thursday":
			System.out.println("Donnerstag");
			break;
		case "Friday":
			System.out.println("Freitag");
			break;
		case "Saturday":
			System.out.println("Samstag");
			break;
		case "Sunday":
			System.out.println("Sonntag");
			break;
		default:
			System.out.println("Das ist kein tag der woche");
		}
	}
	
}
