//Arvutab kilomeetrid miilideks

public class Lahendus1{
	static double miilideks(double kilomeetrid){
		return kilomeetrid/1.60934;
	}
	public static void main(String[] args){
		System.out.println(Math.round(miilideks(10)*100)/100.0);
	}
}
//Tulemus: 
//6.21 (10 kilomeetrit on 6.21 miili)
