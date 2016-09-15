package recursiveSyntax;

public class SimpleRandomSentences {

   static final String[] nouns = { "farmer", "rooster", "judge", "man", "maiden",
                                   "cow", "dog", "cat", "cheese" };
                                   
   static final String[] verbs = { "kept", "waked", "married",
                                   "milked", "tossed", "chased", "lay in" };

   static final String[] modifiers = { "that crowed in the morn", "sowing his corn", 
                                       "all shaven and shorn",
                                       "all forlorn", "with the crumpled horn" };                                   

   public static void main(String[] args) {
      while (true) {
         randomSentence();
	     System.out.println(".\n\n");
         try {
             Thread.sleep(3000);
         }
         catch (InterruptedException e) {
         }
      }
   }
   
   static void randomSentence() {
      System.out.print("this is ");
      if (Math.random() > 0.2)
	      randomNounPhrase();
      System.out.print("the house that Jack built");
      if (Math.random() > 0.75) {
         System.out.print(" and ");
         randomSentence();
      }
      
   }
   
   
   static void randomNounPhrase() {
          int n = (int)(Math.random()*nouns.length);
          int v = (int)(Math.random()*verbs.length);
          int m = (int)(Math.random()*modifiers.length);
          System.out.print("the " + nouns[n]);
          if (Math.random() > 0.75)
             System.out.print(" " + modifiers[m]);
          System.out.print(" that " + verbs[v] + " ");
          if (Math.random() > 0.5)
	          randomNounPhrase();
          
          
       }
   
   public String randomItem(String[] listOfStrings){
	return null;
	   
	   
	   
	   
    }
	   
   
 }



   
   
   
   