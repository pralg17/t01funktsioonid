public class Kodune1{
	
	public static double mituProtsenti(double tervik, double osa){
		return 100 * osa / tervik;  //20 moodustab 100-st 20%
	}
	
	public static double protsentArvust(double protsent, double tervik){
		return tervik * protsent / 100;  //20% 100-st on 20
	}
	
	public static double ymarda(double arv, int komakohad){
		return Math.round(arv * Math.pow(10, komakohad)) / Math.pow(10, komakohad);
		
	}
	
	public static void main(String[] args){
		double arv1 = 100;
		double arv2 = 20;
		try{
			arv1 = Double.parseDouble(args[1]);
			arv2 = Double.parseDouble(args[0]);
		} catch(Exception ex) {
			System.out.println("Näide arvudega 20 ja 100");
		}
		
		double protsent = ymarda(mituProtsenti(arv1, arv2), 1);
		double osa = ymarda(protsentArvust(arv2, arv1), 1);
		System.out.println(arv2 + " moodustab arvust " + arv1 + " " + protsent + "%");
		System.out.println(arv2 + "% " + "arvust " + arv1 + " on " + osa);
		
		
	}
}