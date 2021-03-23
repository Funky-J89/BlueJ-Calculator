
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

/**
 * Class Rekenmachine - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Rekenmachine extends JApplet {
  private JPanel paneel;

  public void init() {
    paneel = new RekenmachinePaneel();

    // Maak het paneel tot het content pane van de applet
    setContentPane( paneel );
  }
}

