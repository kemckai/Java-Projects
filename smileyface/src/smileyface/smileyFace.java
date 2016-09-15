package smileyface;

import java.applet.*;
import java.awt.*;

/*
 * @kemckai 
 */

public class smileyFace extends Applet
{
	
	public void init() {
        setSize(300,300);
    }
    public void paint(Graphics x)
{


x.setColor (Color.yellow);
x.fillOval (100,100,100,100);
x.setColor (Color.black);
x.fillOval (120,125,20,20);
x.fillOval (160,125,20,20);
x.drawArc(110, 100, 75, 85, 0, -180);

Font f = new Font("Serif", Font.BOLD,18);
x.setFont(f);
x.drawString("Hello My name is Keith",55, 220);


    }

}


