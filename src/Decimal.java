
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Decimal {
	private String input;
	private int number;
	private StringBuilder output = new StringBuilder();
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
		for (int i=0;i<numbers.length;i++) {
			if (Integer.parseInt(""+numbers[i]) > 6) {
				output.append(numbers[i]);
			} else if(Integer.parseInt(""+numbers[i]) != 1 && Integer.parseInt(""+numbers[i+1]) != 1){
				output.append(numbers[i]);
			}
		}
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
