import javax.swing.JOptionPane;


public class Tutorial50 {
	public static void main(String[] args){ // método principal
	      
	      String fn = JOptionPane.showInputDialog("Enter first number");
	      String sn = JOptionPane.showInputDialog("Enter second number");
	      
	      int num1 = Integer.parseInt(fn); // hace la conversión String a int...
	      int num2 = Integer.parseInt(sn);
	      int sum = num1 + num2;
	      
	      JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
	      
	}
}
