package helpers;

public class month {
	private int month;
	private boolean leapYear;
	
	public month(int month, boolean leapYear){
		this.month = month;
		this.leapYear = leapYear;
	}
	
	public int getMonth(){
		return month;
	}
	
	public boolean getLeapYear(){
		return leapYear;
	}
	
	public void setMonth(int month){
		this.month = month;
		return;
	}
	
	public void setLeapYear(boolean isLeapYear){
		this.leapYear = isLeapYear;
		return;
	}

}
