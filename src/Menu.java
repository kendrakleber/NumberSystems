

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Menu {
	private PrintWriter pw = null;
	String returnChoice;
	
	public Menu(PrintWriter pw) {
<<<<<<< HEAD
=======
		// TODO Auto-generated constructor stub
>>>>>>> b7932eb4e3b7f880dfa03e89eb6d88fa0a2fc8fe
		this.pw = pw;
	}

	public void display() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> b7932eb4e3b7f880dfa03e89eb6d88fa0a2fc8fe
		String choice = JOptionPane.showInputDialog("Type 1 for decimal to binary, type 2 for decimal to hexadecimal,"
				+ "type 3 for binary to decimal, type 4 for binary to hexadecimal, type 5 for hexadeimal to decimal"
				+ "type 6 for hexadecimal to binary");
		returnChoice = choice;
		
	}

	public int getSelection() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
		return 0;
>>>>>>> b7932eb4e3b7f880dfa03e89eb6d88fa0a2fc8fe
		int i = Integer.parseInt(returnChoice);
		if(i >= 1 && i <=6) 
		return i;
		else
		return 7;
	}

<<<<<<< HEAD
}
/*
choice = menu.getSelection();
switch(choice){
case 1: dec.decToBin(); break;
case 2: dec.decToHex(); break;
case 3: bin.binToDec(); break;
case 4: bin.binToHex(); break;
case 5: hex.hexToDec(); break;
case 6: hex.hexToBin(); break;
}*/
=======
}
>>>>>>> b7932eb4e3b7f880dfa03e89eb6d88fa0a2fc8fe
