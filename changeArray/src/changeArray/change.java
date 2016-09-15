/**
 * 
 */
package changeArray;

/**
 * @author juleswells
 *
 */
public class change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,0};
		change(numbers);
		
		for(int y:numbers)
		   System.out.println(y);
	}
	
	public static void change(int x[]){
		for(int counter=0;counter < x.length;counter++)
			x[counter] +=5;
	}

}
