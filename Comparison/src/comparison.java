import java.util.Scanner;

public class comparison {
	
	public static Scanner in;

	public static void main(String[] args) {
		
		
		String userInput = "";
		in = new Scanner(System.in);
		System.out.println("Enter a word:");
	      userInput = in.nextLine();
	    
	    String txt = userInput;
	    String lang = "Keith";
		boolean state = (txt == lang); //assign test result
		System.out.println("String Equality Test:" + " " + state);
		
		state = (txt != lang);//assign result
		System.out.println("String Equality Test:" + " " + state);
		
/*      int dozen =12;
		int score = 20;
		state = (dozen > score);//assign result
		System.out.println("Greater than Test" + " " + state);
		
		state = (dozen < score);
		System.out.println("less than Test" + " " + state);
*/
	}

}
