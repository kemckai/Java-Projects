/**
 * 
 */
package matchBox;

/**
 * @author Kemckai
 *
 */
public class box {

	 

    double width;

    double height;

    double depth;



    // This is an empty constructor

    box() {

                ;

    }



    box(double w, double h, double d) {

                width = w;

                height = h;

                depth = d;

    }



    void getVolume() {

                System.out.println("Volume is : " + width * height * depth);

    }

}
