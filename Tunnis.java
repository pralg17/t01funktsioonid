public class Tunnis {
	static double kroonideks(double eurod){
		return eurod * 15.64;
	}	

	public static double ymardaastmega(double arv, int kohtadearv) {
		return Math.round(arv*Math.pow(10, kohtadearv))/Math.pow(10, kohtadearv);		
	}

	static double ymarda(double arv, int kohtadearv){
		return ymardaastmega(arv, kohtadearv);
	}

	public static void main(String[] args){
		System.out.println(ymarda(kroonideks(4), 2));

	}
}