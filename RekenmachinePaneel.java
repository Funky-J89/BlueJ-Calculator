
/**
 * Write a description of class RekenmachinePaneel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class RekenmachinePaneel extends JPanel {
    // Knoppen, tekstvak en variabelen om mee te rekenen
    private JButton knop0, knop1, knop2, knop3, knop4, knop5, knop6, knop7,
                    knop8, knop9, knopPlus, knopMin, knopKeer, knopDeel, knopUitkomst,
                    knopClear;
    private JTextField rekenvak;
    private String bereken;
    private double getalEen;
    private double getalTwee;
    private double uitkomst;

    public RekenmachinePaneel()     {
      //Layout zelf ingedeeld. Font aangemaakt voor cijfergroottes
      setLayout( null );
      Font font1 = new Font("SansSerif", Font.BOLD, 24);
      
      //Cijferknoppen gekoppeld aan 'CijferHandler'
      knop0 = new JButton("0");
      ActionListener CijferHandler = new CijferHandler();
      knop0.addActionListener ( CijferHandler );
      knop0.setBounds( 10, 290, 70, 70 );
      knop0.setFont(font1);
      
      knop1 = new JButton("1");
      knop1.addActionListener ( CijferHandler );
      knop1.setBounds( 10, 220, 70, 70 );      
      knop1.setFont(font1);
      
      knop2 = new JButton("2");
      knop2.addActionListener ( CijferHandler );
      knop2.setBounds( 80, 220, 70, 70 );
      knop2.setFont(font1);
      
      knop3 = new JButton("3");
      knop3.addActionListener ( CijferHandler );
      knop3.setBounds( 150, 220, 70, 70 );
      knop3.setFont(font1);
      
      knop4 = new JButton("4");
      knop4.addActionListener ( CijferHandler );
      knop4.setBounds( 10, 150, 70, 70 );
      knop4.setFont(font1);
      
      knop5 = new JButton("5");
      knop5.addActionListener ( CijferHandler );
      knop5.setBounds(80, 150, 70, 70 );
      knop5.setFont(font1);
      
      knop6 = new JButton("6");
      knop6.addActionListener ( CijferHandler );
      knop6.setBounds( 150, 150, 70, 70 );
      knop6.setFont(font1);
      
      knop7 = new JButton("7");
      knop7.addActionListener ( CijferHandler );
      knop7.setBounds( 10, 80, 70, 70 );
      knop7.setFont(font1);
      
      knop8 = new JButton("8");
      knop8.addActionListener ( CijferHandler );
      knop8.setBounds( 80, 80, 70, 70 );
      knop8.setFont(font1);
      
      knop9 = new JButton("9");
      knop9.addActionListener ( CijferHandler );
      knop9.setBounds( 150, 80, 70, 70 );
      knop9.setFont(font1);
      
      //Knoppen voor bewerken (+, -, *, /, C) gekoppeld aan 'Bewerking'
      knopPlus = new JButton("+");
      ActionListener Bewerking = new Bewerking();
      knopPlus.addActionListener ( Bewerking );
      knopPlus.setBounds( 220, 80, 70, 70 );
      knopPlus.setFont(font1);
      
      knopMin = new JButton("-");
      knopMin.addActionListener ( Bewerking );
      knopMin.setBounds(220, 150, 70, 70 );
      knopMin.setFont(font1);
      
      knopKeer = new JButton("*");
      knopKeer.addActionListener ( Bewerking );
      knopKeer.setBounds( 220, 220, 70 ,70 );
      knopKeer.setFont(font1);
      
      knopDeel = new JButton("/");
      knopDeel.addActionListener ( Bewerking );
      knopDeel.setBounds( 80, 290, 70, 70  );
      knopDeel.setFont(font1);
      
      knopClear = new JButton("C");
      knopClear.addActionListener ( Bewerking );
      knopClear.setBounds( 150, 290, 70, 70  );
      knopClear.setFont(font1);
      
      //Uitrekenknop gekoppeld aan 'KnopUitkomstHandler'
      knopUitkomst = new JButton("=");
      knopUitkomst.addActionListener ( new KnopUitkomstHandler() );
      knopUitkomst.setBounds( 220, 290, 70, 70 );
      knopUitkomst.setFont(font1);
      
      //Tekstvak om in te rekenen, alleen lezen&kopieren
      rekenvak = new JTextField( 15 );
      rekenvak.setEditable( false );
      rekenvak.setBounds( 10, 10, 280, 70 );
      rekenvak.setFont(font1);
     
      //Knoppen layout
      add( rekenvak );
      add( knop7 );
      add( knop8 );
      add( knop9 );
      add( knopPlus );
      add( knop4 );
      add( knop5 );
      add( knop6 );
      add( knopMin );
      add( knop1 );
      add( knop2 );
      add( knop3 );
      add( knopKeer );
      add( knop0 );
      add( knopDeel );
      add( knopClear );
      add( knopUitkomst );
    }                           
    
    //Klasse CijferHandler checkt input en voegt cijfer toe aan tekstvak
    class CijferHandler implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            if (e.getSource() == knop0 ) {
              rekenvak.setText( rekenvak.getText() + "0" );
            } 
            else if (e.getSource() == knop1 ) {
              rekenvak.setText( rekenvak.getText() + "1" );
            }  
            else if (e.getSource() == knop2 ) {
              rekenvak.setText( rekenvak.getText() + "2" );
            }             
            else if (e.getSource() == knop3 ) {
              rekenvak.setText( rekenvak.getText() + "3" );
            }             
            else if (e.getSource() == knop4 ) {
              rekenvak.setText( rekenvak.getText() + "4" );
            }             
            else if (e.getSource() == knop5 ) {
              rekenvak.setText( rekenvak.getText() + "5" );
            } 
            else if (e.getSource() == knop6 ) {
              rekenvak.setText( rekenvak.getText() + "6" );
            }             
            else if (e.getSource() == knop7 ) {
              rekenvak.setText( rekenvak.getText() + "7" );
            }             
            else if (e.getSource() == knop8 ) {
              rekenvak.setText( rekenvak.getText() + "8" );
            }             
            else if (e.getSource() == knop9 ) {
              rekenvak.setText( rekenvak.getText() + "9" );
            }             
        }
    }
    
    //Slaat tekst 'rekenvak' op in var getalEen, slaat bewerkingsknop op in var 'bereken'
    //C leegt var getalEen & 'bereken'. Tekstvak leeg na klik op bewerkingsknop
    class Bewerking implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getalEen = Double.parseDouble( rekenvak.getText() );
            if (e.getSource() == knopPlus ) {
                bereken = "+";
            }
            else if (e.getSource() == knopMin ) {
                bereken = "-";
            }
            else if (e.getSource() == knopKeer ) {
                bereken = "*";
            }
            else if (e.getSource() == knopDeel ) {
                bereken = "/";
            }
            else if (e.getSource() == knopClear ) {
                getalEen = 0;
                bereken = "";
            }
            rekenvak.setText( "" );            
        }
    }
    
    /*Berekend uitkomst bij klik op '='. Slaat 2e getal op in var getalTwee checkt bewerking,
    berekent uitkomst en plaatst in leeg rekenvak. var bereken leeg*/
    class KnopUitkomstHandler implements ActionListener {
      public void actionPerformed( ActionEvent e ) {
          getalTwee = Double.parseDouble( rekenvak.getText() );
          if (bereken == "+") {
              uitkomst = getalEen + getalTwee;
          }
          else if (bereken == "-") {
              uitkomst = getalEen - getalTwee;             
          }
          else if (bereken == "*") {
              uitkomst = getalEen * getalTwee;            
          }
          else if (bereken == "/") {
              uitkomst = getalEen / getalTwee;            
          } 
          
          if (uitkomst == Math.floor(uitkomst)) {
            int rondUitkomst = (int)uitkomst;
            rekenvak.setText( "" + rondUitkomst );
          }
          else {
          rekenvak.setText( "" + uitkomst );
          }
          bereken = "";            
      }           
    }
}   
