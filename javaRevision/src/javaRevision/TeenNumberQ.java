package javaRevision;

public class TeenNumberQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeenNumberQ teenNumberQ = new TeenNumberQ();
		System.out.println(teenNumberQ.hasTeen(13, 20, 10));
		System.out.println(teenNumberQ.hasTeen(20, 19, 10));
		System.out.println(teenNumberQ.hasTeen(20, 10, 13));
		System.out.println(teenNumberQ.hasTeen(30, 20, 10));
	}
	
	public boolean hasTeen(int age1, int age2, int age3) {
		boolean teen;
		if(age1 >= 13 && age1 <=19) {
			teen = true;
		}
		else if(age2 >= 13 && age2 <=19) {
			teen = true;
		}
		else if(age3 >= 13 && age3 <=19) {
			teen = true;
		}
		else {
			teen = false;
		}
		return teen;
	}

}
