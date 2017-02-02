public class Testfunktsioon{
	static double kilomeetrideks(double meetrid){
		return meetrid/1000;
	}
	static double meetriteks(double kilomeetrid){
		return kilomeetrid*1000;
	}
	public static void main(String[] args){
		System.out.println(Math.round(kilomeetrideks(2000)*100)/100.0);
		System.out.println(Math.round(meetriteks(3)*100)/100.0);
	}
}