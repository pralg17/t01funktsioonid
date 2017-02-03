public class alamprogrammid{
	public static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	public static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
			//arvutage sentimeetritest tollid
	}		
			//looge alamprogramm kolmnurga hüpotenuusi leidmiseks kaatetite järgi
			//ruutjuure funktsioon Math.sqrt
	public static double hypotenuus(double a, double b){
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}	
	public static void main(String[] args){
		double tollidearv=3;
		double sentimeetritearv=sentimeetriteks(tollidearv);
		System.out.println(tollidearv+" tolli on "+sentimeetritearv+" sentimeetrit");
		System.out.println(String.format("sentimeetreid: %.2f", tollideks(10)));
		System.out.println(hypotenuus(3, 4));
	}
	
}
	
