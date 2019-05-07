package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String  test = JOptionPane.showInputDialog("What is your test score");
	Double testsc = Double.parseDouble(test);
	
	if (testsc>=100) {
		JOptionPane.showMessageDialog(null,"Thats impressive");
	}
	else if (testsc>=90) {
		JOptionPane.showMessageDialog(null, "Wow! You mustve worked hard for that score");
	}
	else if(testsc>=80) {
		JOptionPane.showMessageDialog(null, "Nice job, try harder next time");
	}
	else {
		JOptionPane.showMessageDialog(null, "Oof, thats pretty bad");
	}
}
}
