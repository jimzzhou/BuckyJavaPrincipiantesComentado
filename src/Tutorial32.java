
public class Tutorial32 {
	public static void main(String[] args){ // m�todo principal
	      int bucky[]={3,4,5,6,7};
	      change(bucky);

	      // Sintaxis: tipo identificador: NombreArray
	      for(int y:bucky) // recorre todo el array y lo almacena en ---> y
	         System.out.println(y); // 8, 9, 10, 11, 12
	}

	public static void change(int x[]){ // m�todo de clase (porque fuera del m�todo main tiene que ser static)
	      for(int counter=0;counter<x.length;counter++)
	         x[counter]+=5;
	}
}
