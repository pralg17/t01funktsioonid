public class Kodune1 {
	public static double tombejoud (double m1, double m2, double tegur){
		return m1*tegur*9.8-9.8*m2;
		
	}
	public static void main(String[] arg){
		System.out.println(tombejoud(7500,9000,0.6));
	}
}