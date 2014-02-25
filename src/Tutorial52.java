import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Tutorial52 extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	   
	public Tutorial52(){ // Constructor
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
	}
	
	
}
