package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ExcersiseTwo {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Put in a number pls");
	int number = Integer.parseInt(num);
for(int i = 0; i < 10; i++) {
	
	System.out.println(number);
}
}
}
