package ed.school;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calendar {
	
	
	
	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 100, 900, 600);
	
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setBounds(10 , 10 , 100 , 50);
		window.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setBounds(120 , 10 , 100 , 50);
		window.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setBounds(230 , 10 , 100 , 50);
		window.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setBounds(340 , 10 , 100 , 50);
		window.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setBounds(450 , 10 , 100 , 50);
		window.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setBounds(560 , 10 , 100 , 50);
		window.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setBounds(670 , 10 , 100 , 50);
		window.add(lblSunday);

}
}
