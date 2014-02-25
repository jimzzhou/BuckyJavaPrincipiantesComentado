import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tutorial62 { // m�todo principal
	public static void main(String[] args){
	      Gui m = new Gui();
	      m.setVisible(true);
	}
}

class Gui extends JFrame{
	   
	   private JButton reg;
	   private JButton custom;
	   
	   /**
	    * Constructor
	    */
	   public Gui(){ // Constructor
	      super("The title");
	      setLayout(new FlowLayout()); // Gestor de Dise�o
	      
	      reg = new JButton("reg Button"); // bot�n
	      add(reg); // a�adimos bot�n al Gestor de Dise�o
	      
	      Icon b = new ImageIcon(getClass().getResource("a.png")); // icono
	      Icon x = new ImageIcon(getClass().getResource("x.png")); // icono
	      custom = new JButton("Custom", b); // bot�n (con �cono)
	      custom.setRolloverIcon(x);
	      add(custom); // a�adimos bot�n al Gestor de Dise�o
	   }

	}
