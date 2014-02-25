import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tutorial63 {
	public static void main(String[] args){
	      Gui2 go = new Gui2();
	      go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      go.setSize(300,200);
	      go.setVisible(true);
	      
	}
}

class Gui2 extends JFrame{
	   
	   private JButton reg;
	   private JButton custom;
	   
	   /**
	    * Constructor
	    */
	   public Gui2(){ // Constructor
	      super("The title");
	      setLayout(new FlowLayout()); // Gestor de Dise�o
	      
	      reg = new JButton("reg Button"); // bot�n
	      add(reg); // a�adimos bot�n al Gestor de Dise�o
	      
	      Icon b = new ImageIcon(getClass().getResource("b.png")); // icono
	      Icon x = new ImageIcon(getClass().getResource("x.png")); // icono
	      custom = new JButton("Custom", b); // bot�n (con �cono)
	      custom.setRolloverIcon(x);
	      add(custom); // a�adimos bot�n al Gestor de Dise�o
	      
	      HandlerClass handler = new HandlerClass();
	      reg.addActionListener(handler); // a�adimos vigilante
	      custom.addActionListener(handler); // a�adimos vigilante
	   }
	   
	   /**
	    * clase: HandlerClass (dentro de clase Gui2)
	    * 
	    * implements ActionListener
	    *
	    */
	   private class HandlerClass implements ActionListener{
		    public void actionPerformed(ActionEvent event){ // m�todo implementado del interface ActionListener
		       JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand())); // devuelve el nombre del bot�n...
		    }
	   }
}





