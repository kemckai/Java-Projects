//a program to compare constants
 
public class Constants {

	
	
// calculate score values
 
	public static void main(String[] args) {
		final int TOUCHDOWN = 6;
		final int CONVERSION = 1;
		final int FIELDGOAL = 3;
		
// initialize variables
		int td;
	    int pat;
	    int fg;
	    int total;
	    
//calculate points scoredd
	    
	    td = 4 * TOUCHDOWN;
	    pat = 3 * CONVERSION;
	    fg = 2 * FIELDGOAL;
	    total = (td + pat + fg);
	    
//output the total
	    
	    System.out.println( "Score is"+ " " + total);
		
		

	}

}
