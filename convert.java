//Arvutab kilomeetrid miilideks

public class convert{
	static double miilideks(double kilomeetrid){
		return kilomeetrid/1.60934;
	}
	public static void main(String[] args){
		System.out.println(Math.round(miilideks(15)*100)/100.0);
	}
}


/*
[joosjuha@greeny t01funktsioonid]$ java convert
9.32 (15 km on 9,32 miili)


*/
