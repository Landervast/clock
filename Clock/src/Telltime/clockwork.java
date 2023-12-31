package Telltime;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class clockwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClockLabel date = new ClockLabel("date");
		ClockLabel time = new ClockLabel ("time");
		ClockLabel day = new ClockLabel ("day");
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		javax.swing.JFrame frame = new javax.swing.JFrame ("Clock Sample");	
		frame.setSize(400, 150);
		frame.getContentPane().setLayout(new GridLayout(3,1));
		frame.setVisible(true);
		frame.getContentPane().add(date);
		frame.getContentPane().add(time);
		frame.getContentPane().add(day);
		frame.getContentPane().setBackground(Color.black);
		
		
		}

	private static Object JFrame(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

class ClockLabel extends JLabel implements ActionListener{


String type1;
SimpleDateFormat sdf;
private String type;

public ClockLabel(String type) {
	
	this.type1 = type;
	setForeground(Color.green);
	
	switch (type) {
	
	case "date" : sdf = new SimpleDateFormat("dd MMMM YYYY");
	        
	             setFont (new Font("Garamond",Font.BOLD, 12 ));
	             setHorizontalAlignment(SwingConstants.LEFT);
	             break;
	             
	case "time" : sdf = new SimpleDateFormat ("hh:mm:ss a");
	
	             setFont (new Font("Garamond", Font.BOLD, 40));
	             setHorizontalAlignment(SwingConstants.CENTER);
	             break;
	
	case "day" : sdf = new SimpleDateFormat("EEEE ");
	
	             setFont (new Font("Garamond", Font.BOLD, 16));
	             setHorizontalAlignment (SwingConstants.RIGHT);
	             break;
	       
	default  :  sdf = new SimpleDateFormat();
	            break;
	            
	            
	            	}
	
	Timer timer = new Timer (1000, this);
	timer.start();
	
	
}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		setText(sdf.format(d));
		
		
		
	}
	
	
	
}