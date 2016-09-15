/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravity_calculator;
import java.io.*;

public class Gravity_calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a; // Earth's gravity in m/s^2
        a = -9.81;

        double vi = 0; // starting velocity of the object
        

        double t = 10.0; // time in seconds that the object falls

        double xi; // Starting position in meters, the calculation will determine the ending position in meters
        xi = 0.0;

        double finalPosition = .5 * a * t * t + 0 + xi;

        System.out.println("The object's position after " + t + " seconds is " + finalPosition + " m.");

    }
}
