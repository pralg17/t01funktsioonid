public class Alamprogrammid{
	//lisage alamprogramm mis arvutab sentimeetrid tollideks
	static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	
	static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
	}
	
	static double ymardatsykliga(double arv, int kohtadearv){
		
		double kordaja=1;
		for(int i=0; i<kohtadearv; i++){
			kordaja=10;
		}
		return Math.round(arv*kordaja)/kordaja;
	}
	
	static double ymardaAstendades(double arv, int kohtadearv){
		return Math.round(arv*Math.pow(10, kohtadearv));
		
	}
	
	static double ymarda(double arv, int kohtadearv){
		return ymardaAstendades(arv, kohtadearv);
		
	}
	
	public static void main(String[] args){
		System.out.println(sentimeetriteks(0.5));
		System.out.println(Math.round(tollideks(3)*100)/100.0);//kaht kohta peale koma, kolme jaoks korrutan 1000-ndega
		System.out.println(ymarda(tollideks(3),4));
	}
	
	
	
}