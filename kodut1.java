public class kodut1{
 	//arvutab inimese vanuse
 	public static String vanus(int synniaasta){
 		int aasta=2017;
 		return ("Su vanus on "+(aasta-synniaasta)+" või on sünnipäev alles tulemas.");
 	}
 	public static void main(String[] args){
 		
 		System.out.println(vanus(1996));
 		
 	}
 }
