/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyes;

/**
 *
 * @author kmckai
 */
public class Snakeeyes {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int die1, die2;   // The values rolled on the two dice.
           
           int countRolls = 0;   // Used to count the number of rolls.
           
           countRolls = 0;
           
           
           for (int i = 0; i < 10; i++) {
           do {
              die1 = (int)(Math.random()*6) + 1;   // roll the dice
              die2 = (int)(Math.random()*6) + 1;
              countRolls++; // and count this roll
              
           } while ( die1 != 1 || die2 != 1 );
           
           }
          
           //TextIO.putln("It took " + countRolls + " rolls to get snake eyes.");
           TextIO.putln("The average number of snake eyes per 100 rolls is "  + countRolls/100);
        }
           
    
    
}
      
    

