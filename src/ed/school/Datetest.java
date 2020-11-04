package ed.school;

public class Datetest {

	public static void main(String[] args) {
	
		Date d = new Date(21, 22, 15, 3, 3, 2021);
		Date d1 = new Date(33, 21, 3, 12, 8, 2011);
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d1.compareTo(d));
		System.out.println(d1.LeapYear());
		
	

}
}
