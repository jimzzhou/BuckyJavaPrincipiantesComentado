
public class Tutorial34 {
	public static void main (String[] args){ // m�todo principal
	      int firstarray[][] = {{8,9,10,11},{12,13,14,15}};
	      int secondarray[][] = {{30,31,32,33},{43},{4,5,6}}; 
	      
	      System.out.println("This is the first array");
	      display(firstarray);
	      
	      System.out.println("This is the second array");
	      display(secondarray);
	   }
	   
	public static void display (int x [][]){ // m�todo de clase. Es static porque est� fuera del main...
	      for(int row=0;row <x.length;row++){ // filas
	         for(int column=0;column < x[row].length;column++){ // columnas....va de 0 hasta la longitud de la fila....
	            System.out.print(x[row][column]+"\t");
	         }
	         System.out.println();
	      }
	 }

}
