public class Kraadid{
	
	static double fahrenheitideks (double celsius){
		return celsius*33.8;
		
	}

	static double ymardaTsykliga(double arv, int kohtadearv){
		double kordaja=1;
		for (int i=0; i<kohtadearv; i++){
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
		System.out.println(fahrenheitideks(0.5));
		System.out.println(ymarda(fahrenheitideks(3), 4));
	}
	
}
/*
[johareil@greeny t01funktsioonid]$ java Kraadid
16.9
101.4

*/