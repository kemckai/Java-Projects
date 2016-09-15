/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songwriter;

import java.io.*;
public class Songwriter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {  // Create the input stream.
             TextReader data = new TextReader(new FileReader("songstructure.dat"));
      }
      catch (FileNotFoundException e) {
         System.out.println("Can't find file songwriter.dat!");
      }
         
         try {  // Create the output stream.
             PrintWriter result = new PrintWriter(new FileWriter("result.dat"));
      }
      catch (IOException e) {
         System.out.println("Can't open file result.dat!");
         System.out.println(e.toString());
         data.close();  // Close the input file.
      }
        // TODO code application logic here
    }

    private static class data {

        private static void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public data() {
        }
    }
    
}
