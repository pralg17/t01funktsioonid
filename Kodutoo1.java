public class Kodutoo1{
	public static double astendamine(double arv, double aste){
		return Math.pow(arv, aste);
	}
	public static void main(String[] args){
		double arv = Double.parseDouble( args[0] );
		double aste = Double.parseDouble( args[1] );
		System.out.println ("Arv "+args[0]+ " astmes " +args[1]+ " vordub "+astendamine(arv,aste));
	}
}

/*[mihhkuzm@greeny t01funktsioonid]$ java Kodutoo1 2 4
Arv 2 astmes 4 vordub 16.0
[mihhkuzm@greeny t01funktsioonid]$ java Kodutoo1 3 5
Arv 3 astmes 5 vordub 243.0
*/