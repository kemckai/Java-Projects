package random_number_generator;
import java.security.SecureRandom;

/**
 *
 * @author juleswells
 */
public class Random_number_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
        SecureRandom x = new SecureRandom();
        System.out.println(x.nextInt());
    }
        
  }
    
    
}
