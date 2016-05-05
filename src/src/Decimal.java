package src;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Decimal {
	private String input;
	private int number;
	private String output;
	private static String MESSAGE = "Input Your Number";
	private PrintWriter pw;

	public Decimal(PrintWriter pw) {
		this.pw = pw;
	}

	public void decToBin() {
		inputDec();
		toBin();
		outBin();
	}

	public void decToHex() {
		inputDec();
		toHex();
		outHex();
	}

	private void outHex() {
		// TODO Auto-generated method stub

	}

	private void toHex() {
		char[] numbers = input.toCharArray();

	}

	private void outBin() {
		// TODO Auto-generated method stub

	}

	private void toBin() {
		// TODO Auto-generated method stub

	}

	private void inputDec() {
		input = JOptionPane.showInputDialog(null, MESSAGE);
		number = Integer.parseInt(input);
	}

}
