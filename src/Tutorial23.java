
public class Tutorial23 {
	public static void main(String[] args){ // método principal
	      double amount;
	      double principal = 10000;
	      double rate = .01;

	      
	      for(int day=1;day<=20;day++){ // desde 1 hasta 20...
	         amount=principal*Math.pow(1 + rate, day);
	         System.out.println(day + "   "+ amount);
	      }
	}
}
