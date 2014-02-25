
public class Tutorial36 { // Clase 1
	public static void main(String[] args) { // método principal
	      Tunasandwich tunaObject = new Tunasandwich(); 
	      System.out.println(tunaObject.toMilitary()); // 00:00:00
	      tunaObject.setTime(13, 27, 6);
	      System.out.println(tunaObject.toMilitary()); // 13:27:6
	}
}

class Tunasandwich { // Clase 2
	   private int hour;
	   private int minute;
	   private int second;
	   
	   public void setTime(int h, int m, int s){ // método de instancia setter
	      hour = ((h>=0 && h<24) ? h : 0);
	      minute = ((m>=0 && m<60) ? m : 0);
	      second = ((s>=0 && s<60) ? s : 0);
	   }
	   
	   public  String toMilitary(){ // método de instancia
	      return String.format("%02d:%02d:%02d", hour, minute, second);
	   }
}
