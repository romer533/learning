package samples.applets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="SimpleApplet" width="200" height="60"></applet>
 */

public class SimpleApplet extends Applet {

    public void print(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }

}
