package StatCalc;

public class StatCalc {
	
	 private int counter;   // Number of numbers that have been entered.
     private double sum;  // The sum of all the items that have been entered.
     private double squareSum;  // The sum of the squares of all the items.
     private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
     private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.
  
     public void enter(double num) {
           // Add the number to the dataset.
        counter++;
        sum += num;
        squareSum += num*num;
        if (num > max)
           max = num;
        if (num < min)
           min = num;
     }
  
     public int getCount() {   
           // Return number of items that have been entered.
        return counter;
     }
  
     public double getSum() {
           // Return the sum of all the items that have been entered.
        return sum;
     }
  
     public double getMean() {
           // Return average of all the items that have been entered.
           // Value is Double.NaN if count == 0.
        return sum / counter;  
     }
  
     public double getStandardDeviation() {  
          // Return standard deviation of all the items that have been entered.
          // Value will be Double.NaN if count == 0.
        double mean = getMean();
        return Math.sqrt( squareSum/counter - mean*mean );
     }
     
     public double getMin() {
          // Return the smallest item that has been entered.
          // Value will be infinity if no items have been entered.
        return min;
     }
     
     public double getMax() {
          // Return the largest item that has been entered.
          // Value will be -infinity if no items have been entered.
        return max;
     }
  
   // end class StatCalc

	public static void main(String[] args) {
		StatCalc calc;  // Computes stat for numbers entered by user.
        calc = new StatCalc();
        
        double item;    // One number entered by the user.
        
        TextIO.putln("Enter your numbers line by line, enter a zero to end dataset.");
        TextIO.putln();
        
        do {
           TextIO.put("new Number here? ");
           item = TextIO.getlnDouble();
           if (item != 0)
              calc.enter(item);
        } while ( item != 0 );
        
        TextIO.putln("\nStatistics about your calc:\n");
        TextIO.putln("   Count:              " + calc.getCount());
        TextIO.putln("   Sum:                " + calc.getSum());
        TextIO.putln("   Minimum:            " + calc.getMin());
        TextIO.putln("   Maximum:            " + calc.getMax());
        TextIO.putln("   Average:            " + calc.getMean());
        TextIO.putln("   Standard Deviation: " + calc.getStandardDeviation());
        
     }  // end main()

	}


