import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Tutorial70_71 extends JFrame{
	   private JList list;
	   private String colorNames[ ] = {"black", "blue", "red", "green"};
	   private Color colors[ ] = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
	   
	   public static void main(String args[ ]) { // m�todo principal
		  Tutorial70_71 gui = new Tutorial70_71();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(300, 200);
	      gui.setVisible(true);
	   }
	   /**
	    * Constructor
	    */
	   Tutorial70_71() { // Constructor
		      super("background changer");
		      setLayout(new FlowLayout()); // aplicamos Gestor de Dise�o...
		      
		      list = new JList(colorNames); // creamos JList...
		      list.setVisibleRowCount(colorNames.length); // pone el n�mero de filas que son visibles...
		      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // para que s�lo podamos elegir una opci�n
		      add(new JScrollPane(list)); // metes el JList dentro de un JScrollPane (scroll), y este lo aplicas al JFrame...
		      getContentPane().setBackground(colors[0]);
		      
		      list.addListSelectionListener( // a�adimos vigilante
		         new ListSelectionListener() { // Clase (interface)
		            public void valueChanged(ListSelectionEvent event) { // m�todo implementado del interface...
		               getContentPane().setBackground(colors[list.getSelectedIndex()]);   
		            }
		         }
		      );
		   }
}
