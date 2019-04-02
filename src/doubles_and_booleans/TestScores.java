package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String  test = JOptionPane.showInputDialog("What is your test score");
	Double testsc = Double.parseDouble(test);
	
	if (test.equals(80)) {
		JOptionPane.showMessageDialog(null,"wow you mustve worked hard for that score");
	}
	else if (test.equals(100)) {
		JOptionPane.showMessageDialog(null, "wow you mustve worked hard for that score");
	}
	else {
		JOptionPane.showMessageDialog(null, "thats pretty good");
	}
}
}
