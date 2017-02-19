public class ylesanne{
	//arvutab vanuse
	public static String vanus(int synniaasta){
		int aasta=2017;
		return ("Te olete juba "+(aasta-synniaasta)+" või saate see aasta.");
	}
	public static void main(String[] args){
		
		System.out.println(vanus(1995));
		
	}
}

/*

[ukupode@greeny t01funktsioonid]$ java ylesanne
Te olete juba 22 või saate see aasta.




*/