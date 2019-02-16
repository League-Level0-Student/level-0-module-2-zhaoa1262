package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you in years?");
	Integer.parseInt(age);
	int voter = Integer.parseInt(age);

	if (voter<18) {
		JOptionPane.showMessageDialog(null, "Your opinion does not matter yet");
	}
	
	if (voter>18) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
	}
}
}