
public class Tutorial48 { // Clase 1
	public static void main(String[] args){ // método principal
	      Tuna55 tunaObject = new Tuna55(10);
	      
	      for(int i=0; i<5;i++){ // desde 0 hasta 4...
	         tunaObject.add();
	         System.out.printf("%s", tunaObject);  // sum=10, sum=20, sum=30, sum=40, sum=50
	      }
	      // tunaObject.NUMBER = 5; // (incorrecto) -->> una variable final (constante) no puede ser modificada
	}
}

class Tuna55 { // Clase 2
	   private int sum;
	   private final int NUMBER; // constante...
	   
	   public Tuna55(int x){ // Constructor
	      NUMBER = x;
	   }
	   public void add(){ // método de instancia
	      sum+=NUMBER; // la variable sum va a cambiar, pero NUMBER permanece siempre constante
	   }
	   public String toString(){ // método de instancia
	      return String.format("sum = %d\n", sum);
	   }

}
