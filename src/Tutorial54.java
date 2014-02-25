import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;



public class Tutorial54 { // Clase 1
	public static void main(String[] args){ // método principal
		   
	      Tuna777 bucky = new Tuna777();
	      bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      bucky.setSize(350, 100);
	      bucky.setVisible(true);
	}
} // fin Clase 1

class Tuna777 extends JFrame{ // Clase 2
	
	 private JTextField item1;
	 private JTextField item2;
	 private JTextField item3;
	 private JPasswordField passwordField;
	
	 public Tuna777(){ // Constructor
	      super("The title");
	      setLayout(new FlowLayout()); // Gestor de Diseño
	      
	      item1 = new JTextField(10);
	      add(item1); // añadimos JTextField al JFrame...
	      
	      item2 = new JTextField("enter text here");
	      add(item2); // idem...
	      
	      item3 = new JTextField("uneditable", 20);
	      item3.setEditable(false);
	      add(item3); // idem...
	      
	      passwordField = new JPasswordField("mypass");
	      add(passwordField); // idem...
	      
	      Thehandler handler = new Thehandler();
	      
	      item1.addActionListener(handler); // vigilante
	      item2.addActionListener(handler); // vigilante
	      item3.addActionListener(handler); // vigilante
	      passwordField.addActionListener(handler); // vigilante
	   }
	 
	 private class Thehandler implements ActionListener{ // Clase 3 ( dentro de Clase 2)
	      
	      public void actionPerformed(ActionEvent event){ // implementación del interface ActionListener. Cuando se pulsa ENTER...
	         String string = "";
	         
	         if(event.getSource()==item1)
	            string=String.format("field 1: %s",event.getActionCommand()); // te devuelve lo que hayas entrado en el campo...
	         else if (event.getSource()==item2)
	            string=String.format("field 2: %s",event.getActionCommand());
	         else if (event.getSource()==item3)
	            string=String.format("field 3: %s",event.getActionCommand());
	         else if (event.getSource()==passwordField)
	            string=String.format("password field is: %s", event.getActionCommand());
	         
	         JOptionPane.showMessageDialog(null, string);
	      }
	 } // fin Clase 3
	   
	
} // fin Clase 2

