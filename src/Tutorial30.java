import java.util.Random;


public class Tutorial30 {
	
	public static void main(String[] args){ // método principal
	      Random rand = new Random();
	      int freq[] = new int[7]; // de 0 a 6...
	      
	      for(int roll=1;roll<1000;roll++){ // desde 1 hasta 999
	         ++freq[1+rand.nextInt(6)]; // ++freq[números aleatorios de 1-6]
	                                    // Explicación: sumara 1 a cada valor del array...Si por ejemplo se repite 3 vece el indice 2, obtendra  como valor 3 (1+1+1)
	      }

	      System.out.println("Face\tFrequency");

	      for(int face=0;face<freq.length;face++){ // desde 0 hasta 6 (<7)
	         System.out.println(face+"\t"+freq[face]);
	      }
	 }
}
