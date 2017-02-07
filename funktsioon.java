public class funktsioon {
	public static double pohjapindala (double a, double b){
		double S= 0;
		S=a*b;
		return S;
	}
	
	public static void main (String[] args){
		double kaatet1=Double.parseDouble(args[0]);
		double kaatet2=Double.parseDouble(args[1]);
		double korgus=Double.parseDouble(args[2]);
		double tpindala=2*(kaatet1*kaatet2+kaatet2*korgus+kaatet1*korgus);
		double ruumala=korgus*pohjapindala(kaatet1,kaatet2);
		System.out.println("Risttahuka ruumala on "+ruumala);
		System.out.println("Risttahuka pindala on "+tpindala);
			
	}
}