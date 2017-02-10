public class omaFunktsioon{
	public static int tvPindala(int korgus, int laius, int sygavus){
		int vastusKyljed, vastusEesTaga, vastus;
		vastusKyljed=4*(korgus*sygavus);
		vastusEesTaga=2*(laius*korgus);
		vastus=vastusKyljed+vastusEesTaga;
		return vastus;
	}
	
	public static void main(String[] args){	
		int korgus=50;
		int laius=100;
		int sygavus=8;
		System.out.println("Televiisori pindala: "+ tvPindala(korgus, laius, sygavus)+" ruutmeetrit");
	}
}