public class KODUTOO1{
	//Igaüks koostab omaloodud funktsiooni ning näitprogrammi selle kasutamise kohta.
	//Funktsioon looge võimalikult spetsiifiline (võib olla matemaatiliselt lihtne).
	
	//KOOSTAN PROGRAMMI MIS TEISENDAB TUNNID SEKUNDITEKS JA VASTUPIDI
	static double sekunditeks(double tunnid){
		return tunnid*3600;
	}
	static double tundideks(double sekundid){
		return sekundid/3600;
	}
	public static void main(String[] args){
		System.out.println(sekunditeks(0.5));
		System.out.println(tundideks(5000));
		

	}
	
}

//[alarvere@greeny t01funktsioonid]$ java KODUTOO1
//1800.0
//1.3888888888888888
