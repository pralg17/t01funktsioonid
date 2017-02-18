public class  alamprogramm1{
	public static double sentimeetriteks(double tollid) {
		return tollid*2.54;
	}
	public static double tollideks(double sentimeetrid) {
			return sentimeetrid/2.54;
		//arvutage sentimeetritest tollid
	}
	//Looge alamprogramm kolmnurga hüpotenuusi leidmiseks kaatetite järgi
	//Ruutjuure funktsioon Math.sqrt
	public static double hypotenuus(double a, double b) {
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}
	public static void main(String[] args) {
		double tollidearv=3;
		double sentimeetritearv=sentimeetriteks(tollidearv);
		System.out.println(tollidearv+" tolli on "+sentimeetritearv+" sentimeetrit");
		System.out.println(String.format("Sentimeetreid: %.2f", tollideks(10)));
		System.out.println(hypotenuus(3, 4));
	}
}

/*

[jooshint@greeny programmeerimise_pohikursus]$ javac alamprogramm1.java
[jooshint@greeny programmeerimise_pohikursus]$ java alamprogramm1
3.0 tolli on 7.62 sentimeetrit
Sentimeetreid: 3.94
5.0


*/
