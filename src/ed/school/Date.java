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
		if(seconds >= 0 && seconds <= 59) {
		this.seconds = seconds;
		}
		if(minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		}
		if(hours >= 0 && hours <= 59) {
			this.hours = hours;
		}
		if(day >= 0 && day <= 59) {
		this.day = day;
		}
		if(month >= 0 && month <= 59) {
		this.month = month;
		}
		if(year >= 0 && year <= 59) {
		this.year = year;
		}
	}


	public int getSeconds() 
	{
		return seconds;
	}
	
	public int getMinutes() 
	{
		return minutes;
	}
	
	public int getHours() 
	{
		return hours;
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public int getMonth() 
	{
		return month;
	}

	public int getYear() 
	{
		return year;
	}


	
	public int compareTo(Date d) {
		if(this.year ==d.getYear() && this.month == d.getMonth() && this.day == d.getDay()) {
			return 0;
		}
		if(this.year > d.getYear()) {
			return 1;
		}
		else { 
			if(this.month < d.getMonth() ) {
			return (-1);
			}
			else if(this.month > d.getMonth()) {
				return (1);
			}
			else {
				if(this.day < d.getDay()) {
					return (-1);
					}
				else if(this.day > d.getDay()) {
					return (1);
				}else {
					return(-1);
				}
				
				}
				
					
				
			}
	}
	public boolean LeapYear() {
		if (this.year % 4 == 0 ){
			if (this.year % 100 == 0) {
				return (this.year % 400 == 0);
			}
			else {
				return true;
			}
		}
		return false;
		
	}
	
	public int Day_Year() {
		int count = 0;
		if(this.day == 0) {
			return day;
		}
		for(int i = 1 ; i <= this.month ; i++)
		{
			if(i <= 7 && i % 2 == 1) {
				count += 31;
			}
			else if(i >= 8 && i % 2 == 0) {
				count += 30;
			}
		
		}
		count += day;
		return count;
	}
	
	public int Week_Year() {
		int count = 0;
		count = Day_Year() /7;
		return count;
		
	
	
	
	}
	
	public void increaseSeconds() {
		if(this.seconds < 59) {
			seconds +=1;
		}
		else if(this.minutes < 59) {
			minutes +=1;
			seconds =0;
		}
		else if(this.hours < 59) {
			hours += 1;
			minutes =0;
			seconds =0;
		}
			
	}
	
	
	
	
	
	
	

}



