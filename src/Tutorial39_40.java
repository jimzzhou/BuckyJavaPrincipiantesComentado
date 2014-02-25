
public class Tutorial39_40 {
	private int hour;
	   private int minute;
	   private int second;
	   
	   public Tutorial39_40(){ // Constructor sobrecargado
	      this(0,0,0);
	   }
	   public Tutorial39_40(int h){ // Constructor sobrecargado
	      this(h,0,0);
	   }
	   public Tutorial39_40(int h, int m){ // Constructor sobrecargado
	      this(h,m,0);
	   }
	   public Tutorial39_40(int h, int m, int s){ // Constructor sobrecargado
	      setTime(h,m,s);
	   }
	   public void setTime(int h, int m, int s){ // m�todo de instancia
	      setHour(h);
	      setMinute(m);
	      setSecond(s);
	   }
	   public void setHour(int h){ // m�todo de instancia setter
	      hour = ((h>=0 && h<24)?h:0);
	   }
	   public void setMinute(int m){ // m�todo de instancia setter
	      minute = ((m>=0 && m<60)?m:0);
	   }
	   public void setSecond(int s){ // // m�todo de instancia setter
	      second = ((s>=0 && s<60)?s:0);
	   }
	   public int getHour(){ // m�todo de instancia getter
	      return hour;
	   }
	   public int getMinute(){ // m�todo de instancia getter
	      return minute;
	   }
	   public int getSecond(){ // m�todo de instancia getter
	      return second;
	   }
	   public String toMilitary(){ // m�todo de instancia
	      return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	   }
}
