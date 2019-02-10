package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {

		Random t = new Random();
		int number1 = t.nextInt(10);
		int number2 = t.nextInt(10);
		int number3 = t.nextInt(10);
		int number4 = t.nextInt(10);
		int number5 = t.nextInt(10);

		JOptionPane.showMessageDialog(null, number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);

	}
}
