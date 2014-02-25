import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tutorial86 extends JPanel{
	 public static void main(String args[ ]) { // m�todo principal
	      JFrame f = new JFrame("Super draws");
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Tutorial86 d = new Tutorial86();
	      f.add(d); // a�adimos clase Tutorial86 al JFrame
	      f.setSize(500, 280);
	      f.setVisible(true);
	   }
	   
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      this.setBackground(Color.WHITE); // color de fondo: BLANCO	
	      
	      g.setColor(Color.RED); // aplicamos el color ROJO a la linea que vamos a dibujar a continuaci�n...
	      g.drawLine(10, 10, 100, 30);
	      
	      g.setColor(Color.BLUE); // aplicamos el color AZUL al rect�ngulo (sin relleno) que vamos a dibujar a continuaci�n...
	      g.drawRect(10, 50, 100, 30);
	      
	      g.setColor(Color.GREEN); // aplicamos el color VERDE al ovalo (con relleno) que vamos a dibujar a continuaci�n...
	      g.fillOval(10, 123, 100, 30);
	      
	      g.setColor(Color.ORANGE); // aplicamos el color NARANJA al rect�ngulo (con relleno) que vamos a dibujar a continuaci�n...
	      g.fill3DRect(10, 90, 100, 30, true);
	   }
}
