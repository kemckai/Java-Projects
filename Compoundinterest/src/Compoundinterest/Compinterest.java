package Compoundinterest;


/**
 * 
 */

/**
 * @author juleswells
 *
 */
public class Compinterest  {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
	
		double x,y,z,t,ki;
		
		y = Double.parseDouble(args[0]);
		z = Double.parseDouble( args[1]);
		t = Double.parseDouble( args[2]);
		
		x = y * Math.pow((1 + ( z /100.0 )), t);
		
		ki = x - z;
		
		System.out.println("Amount =" + x);
		System.out.println("Compound Interest =" + ki);
	}
		
}


