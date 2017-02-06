public class ylesanne{
	//arvutab vanuse
	public static void main(String[] arg){
		int aasta=2017;
		System.out.println("Tere.");
		if(arg.length==1){
		  //veapüünis try-catch ka juurde
		try{
		   System.out.println("Te olete juba "+(aasta-Integer.parseInt(arg[0]))+" või saate see aasta.");
		} catch(NumberFormatException e){
		   System.out.println("Arvuteisendus ebaõnnestus");
		}
	  } else {
		  System.out.println("Kasuta kujul:java ylesanne 1995");		  
	  }
	}
}

/*

[ukupode@greeny t01funktsioonid]$ java ylesanne 1995
Tere.
Te olete juba 22 või saate see aasta.



*/