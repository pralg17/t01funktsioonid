public class Kerge_teisendamine{
	static double kilomeetriteks(double meetrid){
		return meetrid/1000;
	}
	static double meetriteks(double kilomeetrid){
		return kilomeetrid*1000;
	}
	public static void main(String[] args){
		System.out.println("Teisendamine meetriteks: ");
		System.out.println(Math.round(meetriteks(0.5)*100)/100.0 + " m");
		System.out.println("Teisendamine kilomeetriteks: ");
		System.out.println(Math.round(kilomeetriteks(6750)*100)/100.0 + " km");
	}
}

/*

[krisliiv@greeny t01funktsioonid]$ java Kerge_teisendamine
Teisendamine meetriteks:
500.0 m
Teisendamine kilomeetriteks:
6.75 km

*/