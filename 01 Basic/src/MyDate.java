
public class MyDate {
	
	int day, year;
	String month;
	
	public MyDate() {
		day = 1;
		month = "Jan";
		year = 1900;
	}

	public MyDate(int day, int year, String month) {
		this.day = day;
		this.year = year;
		this.month = month;
	}
	
	public void displayDate() {
		System.out.println("Date : " + day + "-" + month + "-" + year);
	}
	
}


















