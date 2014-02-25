
public class Tutorial31 {

	public static void main(String[] args){ // método principal
	      int bucky[]={3,4,5,6,7}; // array inicializador
	      int total=0;

	      // sintaxis: tipo identificador: nombreArray
	      for(int x: bucky){ // almacenamos en el identificador cada variable del array, va recorriendo todo el array y situandolo en ese identificador...
	         total+=x;
	      }

	      System.out.println(total); // 25
	      
	   }
}
