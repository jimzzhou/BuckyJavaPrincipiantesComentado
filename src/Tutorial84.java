import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Tutorial84 { // Clase 1
	public static void main(String args[ ]) { // método principal
	      JFrame f = new JFrame("Title"); // creamos un objeto JFrame...
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Draws d = new Draws(); 
	      f.add(d); // añadimos al JFrame el objeto Draws
	      f.setSize(400, 250);
	      f.setVisible(true);
	}
}

class Draws extends JPanel { // Clase 2
	   /**
	    * paintComponent -- método de instancia --
	    */
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g); 
	      this.setBackground(Color.WHITE); // aplicamos el color BLANCO como color de fondo
	      
	      g.setColor(Color.BLUE); // aplicamos el color AZUL, al rectángulo que viene a continuación...
	      g.fillRect(10, 10, 100, 30); // dibuja un rectángulo
	      
	      g.setColor(Color.RED); // aplicamos el color ROJO, al rectángulo que viene a continuación...
	      g.fillRect(10, 50, 100, 30);
	      
	      g.setColor(Color.BLACK); // aplicamos el color NEGRO, al texto que viene a continuación...
	      g.drawString("My drawing program", 10, 90); // dibuja texto
	   }
}
