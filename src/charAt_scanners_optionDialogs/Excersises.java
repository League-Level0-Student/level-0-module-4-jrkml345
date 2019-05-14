package charAt_scanners_optionDialogs;

import java.util.Random;

public class Excersises {
	public static void main(String[] args) {

		Random num = new Random();
		int number = num.nextInt(100);
		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
