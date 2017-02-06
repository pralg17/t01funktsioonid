public class Valuuta{
	public static double kroonid(double euro) {
		return euro * 9.44200;
		}
	//aste - 2
    static double ymarda(double arv, int aste){
	return Math.round(arv*Math.pow(10,aste))/Math.pow(10,aste);
    }
	public static void main(String[] arg){
			double euro = 0;
				try{
				euro = new Double(arg[0]);
				}
				catch(Exception e){
				System.out.println(arg[0]+" annab ERROR-i");
				}
		System.out.println(euro+" eurot = "+ymarda(kroonid(euro),2)+" krooni");
	}
}
//Konvertimis kurss on 1 eur = 9.44200 Rootsi krooni
