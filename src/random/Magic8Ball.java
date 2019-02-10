//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"

		Random s = new Random();
		int number = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println(number);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Type in a question for the magical 8 ball");
		// 5. If the random number is 0
		if (number == 0) {
			JOptionPane.showMessageDialog(null, "yes :)");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (number == 1) {
			JOptionPane.showMessageDialog(null, "no :(");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (number == 2) {
			JOptionPane.showMessageDialog(null, "Please ask google :)");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (number == 3) {
			JOptionPane.showMessageDialog(null, "How dare you ask such a thing?!?!?!");
		}
		// -- write your own answer

	}
}
