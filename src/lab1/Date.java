package lab1;

public class Date {
	int year;
	int month;
	int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int daysTo(Date date) {
		
		if(this.year < date.year){
			int temp = this.year; int temp2 = this.month; int temp3 = this.day;
			this.year = date.year; this.month = date.month; this.day = date.day;
			date.year = temp; date.month = temp2; date.day = temp3;
		}
		
		int days = 0;
		int months = 0;
		int yearDifference = Math.abs(this.year - date.year);

		if (this.month < date.month) {
			yearDifference--;
			months += (12 - date.month) + this.month;

		} else {
			months += (this.month - date.month);
		}
		if (this.day < date.day) {
			days += (30 - date.day) + this.day;
			months--;
		} else {
			days += this.day - date.day;
		}

		if (yearDifference > 0) {
			yearDifference *= 365;
		}

		months *= 30;

		days += yearDifference + months;
		return days;
	}

}
