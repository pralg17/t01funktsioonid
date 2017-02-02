public class Alamprogrammid1{
	static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
	}
	static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	static double ymardaTsykliga(double arv, int kohtadearv){
		double kordaja=1;
		for(int i=0; i<kohtadearv; i++){
			kordaja*=10;
		}
		return Math.round(arv*kordaja)/kordaja;
	}
	static double ymardaAstendades(double arv, int kohtadearv){
		return Math.round(arv*Math.pow(10, kohtadearv))/Math.pow(10, kohtadearv);
	}
	static double ymarda(double arv, int kohtadearv){
		//return ymardaTsykliga(arv, kohtadearv);
		return ymardaAstendades(arv, kohtadearv);
	}
	public static void main(String[] args){
		System.out.println(sentimeetriteks(0.5));
		System.out.println(Math.round(tollideks(3)*100)/100.0);
		System.out.println(ymarda(tollideks(3), 4));
	}
}
/*
[mihhkuzm@greeny Algus]$ java Alamprogrammid1
1.27
1.18
1.1811
*/