package javaRevision;

public class WeekendVacationQ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WeekendVacationQ weekendVacationQ = new WeekendVacationQ();
			System.out.println(weekendVacationQ.didWeSleepIn(true, false));	
	}
	
	//accessModifier returnType methodName(parameters being passed in to the method)
	public boolean didWeSleepIn(boolean weekday, boolean vacation) { //method signature
		boolean sleepIn;
		if(!weekday || vacation) {
			sleepIn = true;
		}
		else {
			sleepIn = false;
		}
		return sleepIn;
	}

}
