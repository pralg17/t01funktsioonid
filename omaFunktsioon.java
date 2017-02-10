public class omaFunktsioon{
	public static double tvPindala(double korgus, double laius, double sygavus){
		double vastusKyljed, vastusEesTaga, vastus;
		vastusKyljed=4*(korgus*sygavus);
		vastusEesTaga=2*(laius*korgus);
		vastus=vastusKyljed+vastusEesTaga;
		return vastus;
	}
	
	public static double tvPindalaRuutmeeter(double korgus, double laius, double sygavus){
		double vastusKyljed, vastusEesTaga, vastus, teisendus;
		vastusKyljed=4*(korgus*sygavus);
		vastusEesTaga=2*(laius*korgus);
		vastus=vastusKyljed+vastusEesTaga;
		teisendus=vastus/10000;
		return teisendus;
	}
	
	
	public static void main(String[] args){	
		double korgus=50;
		double laius=100;
		double sygavus=8;
		System.out.println("Televiisori pindala: "+ tvPindala(korgus, laius, sygavus)+" ruutsentimeetrit");
		System.out.println("Televiisori pindala: "+ tvPindalaRuutmeeter(korgus, laius, sygavus)+" ruutmeetrit");
	}
}