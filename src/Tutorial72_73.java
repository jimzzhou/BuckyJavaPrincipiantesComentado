import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;


public class Tutorial72_73 extends JFrame{
	 private JList leftList;
	 private JList rightList;
	 private JButton moveButton;
	 private String foods[ ] = {"fish", "beacon", "chicken", "ham", "egg", "milk", "apple"};
	 
	 public static void main(String args[ ]) { // método principal
		  Tutorial72_73 gui = new Tutorial72_73();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(350, 150);
	      gui.setVisible(true);
	 }
	 /**
	  * Constructor
	  */
	 Tutorial72_73() { // Constructor
	      super("super duper mover");
	      setLayout(new FlowLayout()); // aplicamos Gestor de Diseño...
	      
	      leftList = new JList(foods); // creamos JList...
	      leftList.setVisibleRowCount(5); // pone el número de filas que son visibles...
	      leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // para que podamos elegir múltiples opciones...
	      add(new JScrollPane(leftList)); // metes el JList dentro de un JScrollPane (scroll), y este lo aplicas al JFrame...
	      
	      moveButton = new JButton("move -->"); // creamos JButton...
	      moveButton.addActionListener( // añadimos viligante al JButton...
	         new ActionListener() { // Clase (interface)
	            public void actionPerformed(ActionEvent event) { // método implementado del interface...
	               rightList.setListData(leftList.getSelectedValues()); // añadimos lo que seleccionamos en la lista de la izquierda a la lista de la derecha...
	            }
	         }
	      );
	      add(moveButton); // aplicamos el JButton sobre el JFrame...
	      rightList = new JList(); // creamos JList...(no necesitamos pasarle parámetros, ya lo tenemos de antes...)
	      rightList.setVisibleRowCount(5);
	      rightList.setFixedCellHeight(15);
	      rightList.setFixedCellWidth(100);
	      rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	      add(new JScrollPane(rightList)); // metes el JList dentro de un JScrollPane (scroll), y este lo aplicas al JFrame...
	   }
}
