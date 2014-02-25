import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Tutorial66_67 {
	public static void main(String args[ ]) { // método principal
	      Gui3 gui = new Gui3();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(320, 100);
	      gui.setVisible(true);
	}
}

class Gui3 extends JFrame {
	   private JTextField text;
	   private JRadioButton plain, bold, italic, boldItalic;
	   private Font plainFont, boldFont, italicFont, boldItalicFont;

	   /**
	    * Constructor
	    */
	   Gui3() { // Constructor
	      super("My radio buttons");
	      setLayout(new FlowLayout()); // aplicamos Gestor de Diseño...

	      plainFont = new Font("Serif", Font.PLAIN, 14); // creamos las fuentes...
	      boldFont = new Font("Serif", Font.BOLD, 14);
	      italicFont = new Font("Serif", Font.ITALIC, 14);
	      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	      
	      text = new JTextField("This my super awesome sentence.", 23); // creamos JTextField...
	      text.setFont(plainFont); // aplicamos fuente al JTextField...
	      plain = new JRadioButton("Plain", true); // creamos JRadioButtons...
	      bold = new JRadioButton("Bold", false); 
	      italic = new JRadioButton("Italic", false);
	      boldItalic = new JRadioButton("Bold and italic", false);
	      add(text); // aplicamos el JTextField al JFrame...
	      add(plain); // aplicamos los JRadioButtons al JFrame...
	      add(bold);
	      add(italic);
	      add(boldItalic);
	      
	      ButtonGroup gr = new ButtonGroup(); // Creamos un ButtonGroup...(sólo un botón puede ser seleccionado)
	      gr.add(plain); // añadimos al ButtonGroup los JRadioButtons...
	      gr.add(bold);
	      gr.add(italic);
	      gr.add(boldItalic);
	      
	      plain.addItemListener(new Handler(plainFont)); // añadimos vigilantes a los JRadioButtons...
	      bold.addItemListener(new Handler(boldFont));
	      italic.addItemListener(new Handler(italicFont));
	      boldItalic.addItemListener(new Handler(boldItalicFont));
	   }
	   
	   /**
	    * clase: Handler (dentro de la clase Gui3)
	    * 
	    * implements: ItemListener
	    * 
	    * nota - Se pone esta clase dentro de la otra clase, porque se quieren acceder a variables de instancia privadas de la clase Gui3. Si la pusiera
	    * como clase separada, no prodría acceder a éstas variables.
	    */
	   private class Handler implements ItemListener {
	      Font font;
	      
	      /**
	       * Constructor
	       * 
	       * @param f (Font)
	       */
	      Handler(Font f) { // Constructor
	         font = f;
	      }
	      
	      /**
	       * método implementado del interface ItemListener
	       */
	      public void itemStateChanged(ItemEvent event) {
	         text.setFont(font);   
	      }
	   }
	   
	}
