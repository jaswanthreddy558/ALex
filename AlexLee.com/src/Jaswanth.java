public class Jaswanth {
	String name;
	boolean jas;
	int k ;
	
	public void m1(int k, int l) {
		System.out.println("This is an static method");
		}
	
	public void m1(int l, int m, int n) {
		System.out.println("This is an method overloading");
		}
	public static void name() {
		System.out.println("This is an name method");
		}
    public static void main(String[] args) {
	Jaswanth jas = new Jaswanth();
	Jaswanth.name();
	jas.m1(87, 54);
	jas.m1(87, 76, 98);
	System.out.println("This is an m1 Method ");
	System.out.println();
    }

   
   class b extends Jaswanth {
	@Override
	public void m1(int k, int l) {
		// TODO Auto-generated method stub
		super.m1(98, 87);
		this.name = "Jaswanth";
		this.jas = true;
		this.k = 878;
		System.out.println();
	}

    class c extends Jaswanth{
	
    @Override
    public void m1(int k, int l) {
    super.m1(76, 98);
}
}

}

}
	
	
	
	