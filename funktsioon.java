public class funktsioon{
	
	//teisendan kilod naltesse ja vasutpidi
	static double naeltesse(double kilod){
		return kilod*2.20462;
	}
	static double kilodesse(double naelad){
		return naelad*0.453592;
	}
	public static void main(String[] args){
		System.out.println(naeltesse(20));
		System.out.println(kilodesse(45));
		

	}
	
}

/*
[georvalg@greeny t01funktsioonid]$ java funktsioon
44.0925
20.41164
*/