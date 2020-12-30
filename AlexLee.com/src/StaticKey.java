
public class StaticKey {
	
	
	String name;
	int jas;
	char kite;
	
	
	public void show() {
	System.out.println(name + ":" + jas + ":" + kite);
	}
	
	public static int ja() {
		 String name = "Mahesh";
		 int jas = 890;
		 char kite = 'k';
		 System.out.println("Prinitng this note :" + kite);
		 return ja();
	     }
	 
	 public static String reddy() {
		 String name = "bottle";
		 int jas = 768;
		 System.out.println("Printing this element :" + jas);
		 return reddy();
	 }

}
 class navi{
 public static void main(String[] args) {
			StaticKey key = new StaticKey();
	        key.show();
	        key.ja();
	        key.reddy();
	 
	 
	 }
	 
} 





