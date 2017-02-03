public class Arvutus {
	public static void main (String[] arg) {
		int pikkus=4;
		int laius=5;
		if(arg.length==2) {
			pikkus=Integer.parseInt(arg[0]);
			laius=Integer.parseInt(arg[1]);
		}
		int pindala=pikkus*laius;
		System.out.println(pindala);
	}
}
