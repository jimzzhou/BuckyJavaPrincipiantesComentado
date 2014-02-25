
public class Tutorial29 {
	public static void main(String[] args){ // método principal
	      int bucky[]={21,16,86,21,3}; // array inicializador
	      int sum=0;

	      for(int counter=0;counter<bucky.length;counter++){ // desde 0 hasta 5 (buckly.length)
	         sum+=bucky[counter];
	      }

	      System.out.println("The sum of theze numbers is " +sum); // 147
	}
}
