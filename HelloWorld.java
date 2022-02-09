package First;

//import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		String sentence;
		sentence = "Hello World";
		int i = 0;
		int j = 1;
		
		while (i < sentence.length()) {
			System.out.println(sentence.charAt(i) + " " + (i + j));
			
			i++;
		}
//
	}

}
