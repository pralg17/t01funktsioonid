public class Wingload2{
	public static double wload(double kKaal, double Svari){
		return (kKaal/Svari);
	}
	
	public static void main(String[] args){
		double kKaal=154;
		double Svari=100;
		System.out.println(String.format("Wingload on: %.2f", wload(kKaal, Svari)));

	}
}