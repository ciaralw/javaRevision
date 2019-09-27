package javaRevision2;

public class IfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfPractice ifPractice = new IfPractice();
		System.out.println(ifPractice.icyHot(120, -1));
		System.out.println(ifPractice.icyHot(-1, 120));
		System.out.println(ifPractice.icyHot(2, 120));
	}
	
//	public boolean icyHot(int temp1, int temp2) {
//		if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public boolean icyHot(int temp1, int temp2) {
		boolean result; //equal to false by standard?
		
		if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}

}
