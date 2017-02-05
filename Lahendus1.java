public class Lahendus1{

    public static double naeladeks(double eurod) {
			return eurod*0.86;
		}
    static double ymardaAstendades(double arv, int kohtadearv){
 		   return Math.round(arv*Math.pow(10,kohtadearv))/Math.pow(10, kohtadearv);
    }
		public static void main(String[] arg){
			System.out.println("See programm arvutab sisestatud Eurod ümber Inglise naeladeks");
			double eurod = 0;
			if(arg.length>0 && arg.length<2){
				try{
					eurod=Double.parseDouble(arg[0]);
				}catch(Exception ex){
					System.out.println(arg[0]+" pole arv");
				}
			}else{
				System.out.println("Sisesta ainut üks arv");
			}
		System.out.println(eurod+" eurot on "+ymardaAstendades(naeladeks(eurod),2)+" naela");
		}
}
