import java.util.*;
 
public class BuggySearchAndSort {
 
	    public static void main(String[] args) {
 
		int[] A = new int[10];  // Create an array and fill it with small random ints.
		for (int i = 0; i < 10; i++)
			A[i] = 1 + (int)(10 * Math.random());
 
		int[] B = A.clone();   // Make copies of the array.
		int[] C = A.clone();
		int[] D = A.clone();
 
		System.out.print("The array is:");
		printArray(A);
 
		if (contains(A,5))
			System.out.println("This array DOES contain 5.");
		else
			System.out.println("This array DOES NOT contain 5.");
 
		Arrays.sort(A);  // Sort using Java's built-in sort method!
		System.out.print("Sorted by Arrays.sort():  ");
		printArray(A);   // (Prints a correctly sorted array.)
 
		BubbleSort(B);
		System.out.print("Sorted by Basic Sort:    ");
		printArray(B);
 
		selectionSort(C);
		System.out.print("Sorted by Selection Sort: ");
		printArray(C);
 
		insertionSort(D);
		System.out.print("Sorted by Insertion Sort: ");
		printArray(D);
 
	}
 
	/**
	 * Sorts an array into non-decreasing order.  This inefficient sorting
	 * method simply sweeps through the array, exchanging neighboring elements
	 * that are out of order.  The number of times that it does this is equal
	 * to the length of the array.
	 */
 
	public static boolean contains(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
                if (array[i] == val)
 
                        return true;
        }
 
        return false;
}
 
	public static void BubbleSort(int[] array){
		 for(int i=0; i<array.length -1; i++){
			 for(int j= 1; j<array.length -i; j++){
			 if(array[j-1] > array[j]){
                 int temp = array[j];
                 array[j] = array[j-1];
                 array[j-1] = temp;
             }
       }
			 
 }

		
		
		
		
		
		
		
	}
	/**
	 * Sorts an array into non-decreasing order.  This method uses a selection
	 * sort algorithm, in which the largest item is found and placed at the end of 
	 * the list, then the second-largest in the next to last place, and so on.
	 */
	public static int[] selectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
//www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.MBvbUA6u.dpuf
			//int temp = array[top];  // swap top item with biggest item
			//array[top] = array[positionOfMax];
			//array[positionOfMax] = temp;
		
	//}
 
	/**
	 * Sorts an array into non-decreasing order.  This method uses a standard
	 * insertion sort algorithm, in which each element in turn is moved downwards
	 * past any elements that are greater than it.
	 */
	 public static void insertionSort(int[] array){
         
	        int temp;
	        for (int i = 1; i < array.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(array[j] < array[j-1]){
	                    temp = array[j];
	                    array[j] = array[j-1];
	                    array[j-1] = temp;
	                }
	            }
	            
	        }
	        
	 }
	        
	
	/**
	 * Outputs the ints in an array on one line, separated by spaces,
	 * with a line feed at the end.
	 */
 
	private static void printArray(int[] array) {
 
		for (int i = 0; i < array.length; i++) {
 
			System.out.print(" ");
			System.out.print(array[i]);
		}
 
		System.out.println();
	}
 
}
 