import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Tutorial68_69 {
	public static void main(String args[ ]) { // método principal
	      Box2 box = new Box2();
	      box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      box.setSize(200, 100);
	      box.setVisible(true);
	   }
}

class Box2 extends JFrame {
	   private JComboBox list;
	   private JLabel picture;
	   private static String fileName[ ] = {"x.png", "y.png"};  // array de ficheros
	   private Icon pic[ ] = {new ImageIcon(getClass().getResource(fileName[0])),
	                     new ImageIcon(getClass().getResource(fileName[1]))};  // array de imágenes
	   /**
	    * Constructor
	    */
	   Box2() { // Constructor
	      super("Program: list");
	      setLayout(new FlowLayout()); // aplicamos Gestor de Diseño...
	      list = new JComboBox(fileName); // creamos JComboBox...(le pasamos el array de ficheros, que es lo que va a mostrar)
	      
	      list.addItemListener( // añadimos vigilante al JComboBox...
	         new ItemListener() { // Clase (interface)
	            public void itemStateChanged(ItemEvent event) { // método imlemententado del interface...
	               if(event.getStateChange() == ItemEvent.SELECTED) // significa: Cual fue seleccionado?
	                  picture.setIcon(pic[list.getSelectedIndex()]);
	            }
	         }
	      );
	      
	      add(list); // añadimos el JComboBox al JFrame
	      picture = new JLabel(pic[0]); // algo que aparecerá antes de que elijamos la opción del JComboBox
	      add(picture); // añadimos el Label al JFrame
	      
//	      TheHandler handler = new TheHandler();
//	      list.addItemListener(handler);
	   }
	   
	//   private class TheHandler implements ItemListener {
//	      public void itemStateChanged(ItemEvent event) {
//	         if(event.getStateChange() == ItemEvent.SELECTED)
//	            picture.setIcon(pic[list.getSelectedIndex()]);
//	      }
	//   }
	   
	}