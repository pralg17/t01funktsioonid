public class Kodutöö1 {
	
	static double hypotenuus(double kaatet1, double kaatet2){
		return Math.sqrt(Math.pow(kaatet1, 2)+Math.pow(kaatet2, 2));
	}
	
	public static void main(String[] args){
		
		if (args.length == 2) {
			
			try{
				double kaatet1 = 0;
				double kaatet2 = 0;
				
				
				kaatet1 = Double.parseDouble(args[0]);
				kaatet2 = Double.parseDouble(args[1]);
				
				System.out.println("\n Hüpotenuusi pikkus: " + hypotenuus(kaatet1, kaatet2) + "\n");
			
			} catch (Exception ex) {
				System.out.println("\n Tundub et vähemalt üks sisestatud suurustest polnud arv. Proovi uuesti! \n");
			}
			
		} else {
			
			System.out.println("\n Sisesta programmi välja kutsudes lõppu kolnurga kaatetid eraldades need tühikutega \n");
		
		}
	}
}