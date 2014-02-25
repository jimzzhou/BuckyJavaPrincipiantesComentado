
public class Tutorial37 {
	public static void main(String[] args){ // método principal
		Tunasandwich2 tunaObject = new Tunasandwich2();
	    System.out.println(tunaObject.toMilitary());
	    System.out.println(tunaObject.toString());
	    
	    tunaObject.setTime(13, 27, 6);
	    System.out.println(tunaObject.toMilitary());
	    System.out.println(tunaObject.toString());
	}
}

class Tunasandwich2 {
	   private int hour;
	   private int minute;
	   private int second;
	   
	   public void setTime(int h, int m, int s){ // método de instancia setter.
	      hour = ((h>=0 && h<24) ? h : 0);
	      minute = ((m>=0 && m<60) ? m : 0);
	      second = ((s>=0 && s<60) ? s : 0);
	   }
	   
	   public  String toMilitary(){ // método de instancia 
	      return String.format("%02d:%02d:%02d", hour, minute, second);
	   }
	   
	   public String toString(){ // método de instancia
	      return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12?"AM": "PM"));
	   }
}
