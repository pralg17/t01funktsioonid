public class meetridjardideks{
	static double meetriteks(double jardid){
		return jardid*1.0936;
	}
	static double ymardaTsykliga(double arv, int kohtadearv){
		double kordaja=1;
		for(int i=1; i<kohtadearv; i++){
			kordaja*=10;
		}
		return Math.round(arv*kordaja)/kordaja;
	}
	static double ymarda(double arv, int kohtadearv){
		return ymardaTsykliga(arv,kohtadearv);
	}
	public static void main(String[] args){
	System.out.println(ymarda(meetriteks(354), 4));
	}
}