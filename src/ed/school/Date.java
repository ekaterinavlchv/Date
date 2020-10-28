package ed.school;

public class Date {
	int seconds;
	int minutes;
	int hours;
	int day;
	int month;
	int year;
	
	
	public Date() {
		seconds = 0;
		minutes = 0;
		hours = 0;
		day = 1;
		month = 1;
		year = 1;
	}
	
	
	public Date(int seconds, int minutes, int hours, int day, int month, int year) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getSeconds() 
	{
		return seconds;
	}
	public void setSeconds(int seconds) 
	{
		this.seconds = seconds;
	}
	public int getMinutes() 
	{
		return minutes;
	}
	public void setMinutes(int minutes) 
	{
		this.minutes = minutes;
	}
	public int getHours() 
	{
		return hours;
	}
	public void setHours(int hours) 
	{
		this.hours = hours;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	
	
	

}




