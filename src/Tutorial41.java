
public class Tutorial41 { // Clase1
	public static void main(String[] args){ // método principal
	      
	      tunamil tunaObject = new tunamil();
	      tunamil tunaObject2 = new tunamil(5);
	      tunamil tunaObject3 = new tunamil(5,13);
	      tunamil tunaObject4 = new tunamil(5,13,43);
	      
	      System.out.printf("%s\n", tunaObject.toMilitary());
	      System.out.printf("%s\n", tunaObject2.toMilitary());
	      System.out.printf("%s\n", tunaObject3.toMilitary());
	      System.out.printf("%s\n", tunaObject4.toMilitary());
	      
	}
}

class tunamil { // Clase2
	   private int hour;
	   private int minute;
	   private int second;
	   
	   public tunamil(){ // Constructor sobrecargado
	      this(0,0,0); // llama al Constructor que tenga esos parámetros...
	   }
	   public tunamil(int h){ // Constructor sobrecargado
	      this(h,0,0);
	   }
	   public tunamil(int h, int m){ // Constructor sobrecargado
	      this(h,m,0);
	   }
	   public tunamil(int h, int m, int s){ // Constructor sobrecargado
	      setTime(h,m,s);
	   }
	   public void setTime(int h, int m, int s){ // setter
	      setHour(h);
	      setMinute(m);
	      setSecond(s);
	   }
	   public void setHour(int h){ // setter
	      hour = ((h>=0 && h<24)?h:0);
	   }
	   public void setMinute(int m){ // setter
	      minute = ((m>=0 && m<60)?m:0);
	   }
	   public void setSecond(int s){ // setter
	      second = ((s>=0 && s<60)?s:0);
	   }
	   public int getHour(){ // getter
	      return hour;
	   }
	   public int getMinute(){ // getter
	      return minute;
	   }
	   public int getSecond(){ // getter
	      return second;
	   }
	   public String toMilitary(){ // método de instancia
	      return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	   }
}
