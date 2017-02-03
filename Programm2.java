public class Programm2{
	public static int[] arvudeks(String[] tekstid){
		int[] vastus=new int[tekstid.length];
		for(int i=0; i<tekstid.length; i++){
			vastus[i]=Integer.parseInt(tekstid[i]);
		}
		return vastus;
	}
	
	public static int summa(int[] m){
		int abi = 0;
		for( int arv : m){
			abi += arv;
		}
		return abi;
	}
	
	public static void main(String[] args){
		int[] arvud = arvudeks(args);
		System.out.println(summa(arvud));
	}
}