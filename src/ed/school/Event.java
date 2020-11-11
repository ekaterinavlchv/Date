package ed.school;

public class Event {
	
	private Date date;
	private String name;
	
	public String getName() {
		return name;
	}
	public Date getDate() {
		return date;
	}
	
	
	public Event(Date date , String name) {
			if (name != null && !name.isEmpty())
				this.name = name;
			if (date != null)
				this.date = date;
	}
	
	public String toString() {
		return date.getDay() + "." + date.getMonth() + "." + date.getYear() + ", " + date.getMinutes() + ":" + date.getHours() +  " - " + name;
	}


}
