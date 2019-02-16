package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("What is your height?");
	Integer.parseInt(height);
	int inches = Integer.parseInt(height);
	
	if (inches<48) {
		JOptionPane.showMessageDialog(null, "You may not ride the roller coaster!");
	}
	
	if (inches>=48) {
		JOptionPane.showMessageDialog(null, "You may ride the roller coaster!");
	}
}
}
