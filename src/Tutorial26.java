import java.util.Random;


public class Tutorial26 {
	public static void main(String[] args){ // método principal
	      Random dice = new Random();
	      int number;

	      for(int counter=1; counter<=10;counter++){ // desde 1 hasta 10...
		      //number = dice.nextInt(6); // el método nextInt(6) dara números aleatorios, que abarcarán el rango de 0 - 5 (6 elementos)
	    	  number = 1+ dice.nextInt(6); // devuelve números de rango 1-6...
		      System.out.println(number + " ");
	      }
	}
}
