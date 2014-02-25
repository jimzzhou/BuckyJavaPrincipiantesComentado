
public class Tutorial35 {
	public static void main(String[] args) { // método principal
	      System.out.println(average(43,56,76,8,65,76,2,31));
    }

	/*
	 * int...numbers --> se utiliza si no sabes el número de variables que se van a mandar...
	 * podrías pasar una primera vez:
	 *      System.out.println(average(43,56,76,8,65,76,2,31));
	 * y una segunda vez, añadir más números:
	 *      System.out.println(average(43,56,76,8,65,76,2,31,12,12,13,22,33,55,66,77,45));
	 * que esta función te lo resolvería.
	 */
	public static int average(int...numbers){ // método de clase. Es static porque está fuera del main...
	      int total=0;
	      // Sintaxis: tipo identificador: NombreArray
	      for(int x:numbers)
	         total+=x;
	      
	      return total/numbers.length; // 44
	}
}
