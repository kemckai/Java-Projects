package recursiveSyntax;

public class recursive {


public static int myRecursiveMethod (int x)  {  
  System.out.println(x);  
  x--;  
  if (x == 0)  
    return 0;  
  return myRecursiveMethod(x);  
 }  



  public static void main(String[] args){
	  myRecursiveMethod(2);
	  
	  
	  
  }

}