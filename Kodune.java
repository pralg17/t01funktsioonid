public class Kodune{
	static double kilomeetriteks(double meetrid){
		return meetrid/1000;
	}
	
	static double meetriteks(double kilomeetrid){
		return kilomeetrid*1000;
	}
	
	public static void main(String[] args){
		System.out.println(kilomeetriteks(2500));
		System.out.println(meetriteks(3.4));
	}
}
