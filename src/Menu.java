

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Menu {
	private PrintWriter pw = null;
	String returnChoice;
	
	public Menu(PrintWriter pw) {
		// TODO Auto-generated constructor stub
		this.pw = pw;
	}

	public void display() {
		// TODO Auto-generated method stub
		String choice = JOptionPane.showInputDialog("Type 1 for decimal to binary, type 2 for decimal to hexadecimal,"
				+ "type 3 for binary to decimal, type 4 for binary to hexadecimal, type 5 for hexadeimal to decimal"
				+ "type 6 for hexadecimal to binary");
		returnChoice = choice;
		
	}

	public int getSelection() {
		// TODO Auto-generated method stub
		return 0;
		int i = Integer.parseInt(returnChoice);
		if(i >= 1 && i <=6) 
		return i;
		else
		return 7;
	}

}