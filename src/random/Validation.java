//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You look great!");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You have nice hair!");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You look nice!");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You aren't ugly!");
		} else {
			JOptionPane.showMessageDialog(null, "You don't look tired!");
		}

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
