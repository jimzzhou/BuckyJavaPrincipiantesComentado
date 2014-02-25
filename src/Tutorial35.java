
public class Tutorial35 {
	public static void main(String[] args) { // m�todo principal
	      System.out.println(average(43,56,76,8,65,76,2,31));
    }

	/*
	 * int...numbers --> se utiliza si no sabes el n�mero de variables que se van a mandar...
	 * podr�as pasar una primera vez:
	 *      System.out.println(average(43,56,76,8,65,76,2,31));
	 * y una segunda vez, a�adir m�s n�meros:
	 *      System.out.println(average(43,56,76,8,65,76,2,31,12,12,13,22,33,55,66,77,45));
	 * que esta funci�n te lo resolver�a.
	 */
	public static int average(int...numbers){ // m�todo de clase. Es static porque est� fuera del main...
	      int total=0;
	      // Sintaxis: tipo identificador: NombreArray
	      for(int x:numbers)
	         total+=x;
	      
	      return total/numbers.length; // 44
	}
}
