package First;

import java.util.Scanner;
 

public class UserInput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		str = scan.next();
		for(i = 0; i < str.length(); i ++) {
			System.out.print(i + 1);
		}

	}

}
