package strawberrycones;
/**
 *
 * @author kmckai
 */
public class Strawberrycones {

    public static void main(String[] args) {
       
    try {
     TextIO.readFile("/Users/juleswells/NetBeansProjects/Strawberrycones/src/strawberrycones/icecream.txt");
    }
         
    catch (Exception e) {
     System.out.println("Can't open file \"icecream.txt\" for reading!");
    }
 
         int totalNumberCones = 0;
         int numberStrawberries = 0;

         while (!TextIO.eof()) {
             String readFile = TextIO.getln();
             totalNumberCones++;
             
         if (readFile.equals("Strawberry")) {
                 numberStrawberries++;
             }
         }
         System.out.println("The total number of sold cones is: " + totalNumberCones);
         System.out.println("The total number of sold Strawberry flavoured cones is: " 
         + numberStrawberries);
         System.out.println("The percentage of Strawberry flavoured cones is: " + numberStrawberries * (int)100.0/totalNumberCones);
       
    } 
   
}