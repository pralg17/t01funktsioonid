public class Lihtne {
	
	static double ruuduks (double arv){
		
		return arv*arv;
	}
	
	static double ymardaAstendades(double arv, int kohtadearv){
		return Math.round(arv*Math.pow(10,kohtadearv))/Math.pow(10, kohtadearv);
	}
	
	public static void main(String[] arg) {
		System.out.println("\n See programm võtab sisestatud arvu ja tagastab selle ruudu \n");
		double arv = 0;
		if(arg.length>0){
			if(arg.length<2){
				try{
					arv=Double.parseDouble(arg[0]);
				} catch (Exception ex) {
					System.out.println(arg[0]+" Pole korralik arv");
				}
			} else {
				System.out.println("Palun sisesta vähem arve");
			}
		} else {
			System.out.println("Palun sisesta ainult 1 arv");
		}

		System.out.println("arvu " + arg[0] + " ruut on 2 komakohani ümardatuna " + ymardaAstendades(ruuduks(arv),2) + "\n");
		
		
	}
}