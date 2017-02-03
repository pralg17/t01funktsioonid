public class alamprogramm1{
	public static double sentimeetriteks(double tollid){
		return tollid * 2.54;
	}
	public static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
		//arvutage cm tollid
	}
		//looge alamprogramm kolmnurga hypotenuusi leidmiseks kaatetide jargi
		//ruutjuure funktsioon math.sqrt
	public static double hypotneuus(double a, double b){
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}
	
	public static void main(String[] args){
		double sentimeetritearv = 3;
		double tollidearv = tollideks(sentimeetritearv);
		System.out.println(tollidearv+" tolli on "+sentimeetritearv+" sentimeetrit");
		System.out.println(String.format("Sentimeetreid: %.2f", tollideks(10)));
		System.out.println(hypotneuus(3, 4));
	} 
}