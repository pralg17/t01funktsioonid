public class massiivid {

	public static void main(String[] args){
		if(args.length > 0) {
			System.out.println("viimane:" + args[args.length-1]);
		}
		// olemasolu korral kuva välja eelviimane
		if(args.length > 1) {
			System.out.println("viimane:" + args[args.length-2]);
		}
		System.out.println("loetelu; ");
		for(String sona: args){
			System.out.println(sona);
		}
		// kuvage kasutaja sisestatud arvude summa
		int summa = 0;
		for(string sona: args) {
			//System.out.println(sona);
			summa=Integer.parseInt(sona)+summa;
		}
		System.out.println(summa);
		
	}	
}
