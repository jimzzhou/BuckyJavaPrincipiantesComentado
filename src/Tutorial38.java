
public class Tutorial38 {
	public static void main(String[] args) { // m�todo principal
	      Tunasandwich3 tunaObject = new Tunasandwich3();
	      System.out.println(tunaObject.toMilitary());
	      System.out.println(tunaObject.toString());
	      
	      tunaObject.setTime(13, 27, 6);
	      System.out.println(tunaObject.toMilitary());
	      System.out.println(tunaObject.toString());
	}
}

class Tunasandwich3 {
	   private int hour = 1; // iniciados por defecto...
	   private int minute = 2;
	   private int second = 3;
	   
	   /*
	    * Si tienen el mismo nombre los par�metros que las variables locales, debemos poner
	    * delante la palabra reservada this, para que no coja la inicializaci�n por defecto
	    * de las variables de instancia.
	    */
	   public void setTime(int hour, int minute, int second){ // m�todo de instancia setter.
	      this.hour = 4; 
	      this.minute = 5;
	      this.hour = 6;
	   }
	   
	   public  String toMilitary(){ // m�todo de instancia 
	      return String.format("%02d:%02d:%02d", hour, minute, second);
	   }
	   
	   public String toString(){ // m�todo de instancia
	      return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12?"AM": "PM"));
	   }

	}
