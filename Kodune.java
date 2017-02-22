public class Kodune{
	
	static double ristkylik(double pikkus, double laius){
		
		return pikkus*laius;
	}
	
	
	public static void main(String[] args){
		System.out.println(ristkylik(2, 4));
	}
}
/*
[marirein@greeny t01funktsioonid]$ javac Kodune.java
[marirein@greeny t01funktsioonid]$ java Kodune
8.0

*/