package Palindrome;
import java.util.*;
 
class Palindrome
{
	 private static Scanner in;
	 
	 public static void main(String args[]) {
		
   
	  String userInput = "";
	  String reverse = "";
      in = new Scanner(System.in);
 
      System.out.println("Enter a word for palindrome check");
      userInput = in.nextLine();
      
      String formatString = Strip(userInput);
      System.out.println("Stripped: " + formatString);
      
      String reversedString = reverseInput(formatString);
      System.out.println("Reversed: " + reversedString);
      
      int stringLength = userInput.length();
 
      for ( int i = stringLength - 1; i >= 0; i-- )
         reverse = reverse + userInput.charAt(i);

     
      if (userInput.equals(reverse))
         System.out.println("This word is a palindrome.");
     
      else
         System.out.println("This word is not a palindrome.");
      
   }

      private static String reverseInput(String formatString) {
    	  String reverse = "";
          for (int i = formatString.length() - 1; i >= 0; i--) {
              reverse = reverse + formatString.charAt(i);
          }
          return reverse;
	
	}

      private static String Strip(String userInput) {
    	  String userInputLowerCase = userInput.toLowerCase();
          String formattedUserInput = "";

          for (int i = 0; i < userInputLowerCase.length(); i++) {

              char charValue = userInputLowerCase.charAt(i);

              if (charValue >= 'a' && charValue <= 'z') {
                  formattedUserInput += userInputLowerCase.charAt(i);
              }
          }
          return formattedUserInput;
		
	}
}	