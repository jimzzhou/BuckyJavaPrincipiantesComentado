
public class Tutorial87 {
	public static void main(String[] args){ // método principal
		String a = "apples";
		String b = "bucky";
		String c = "BUCKY";	
		
		System.out.println(a.length()); // 6
		
		if(a.equals("apples")){ // son iguales...
			System.out.println("it equals apples!");
		}
		
		if(b.equals(c)){ // no son iguales...
			System.out.println("buckys match");
		}
		
		if(b.equalsIgnoreCase(c)){ // son iguales...
			System.out.println("buckys match (with ignorecase)");
		}
		
	}
}
