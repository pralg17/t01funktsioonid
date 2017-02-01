public class Kodutoo1{
	public static float valem(float[] massid){
		float N=(massid[0]*massid[1]*massid[2]*massid[3]*massid[4]*massid[5]*massid[6]);
		return N;
	}
	public static void main(String[] args){
		if(args.length<7){
			System.out.println("Liiga vähe argumente!");
		}
		else if(args.length>7){
			System.out.println("Liiga palju argumente!");
		} else {
			float arv1 = (Float.valueOf(args[0])).floatValue();
			float arv2 = (Float.valueOf(args[1])).floatValue(); 
			float arv3 = (Float.valueOf(args[2])).floatValue(); 
			float arv4 = (Float.valueOf(args[3])).floatValue(); 
			float arv5 = (Float.valueOf(args[4])).floatValue(); 
			float arv6 = (Float.valueOf(args[5])).floatValue(); 
			float arv7 = (Float.valueOf(args[6])).floatValue(); 
			float[] massid={arv1, arv2, arv3, arv4, arv5, arv6, arv7};
			float vastus=valem(massid);
			System.out.println("Nii mitu tsivilisatsiooni peaks olema meie galaktikas: "+Math.floor(vastus));
		}
	}
}

//Selle programmiga on võimalik välja arvutada hinnanguline number, kui mitu maavälist tsivilisatsiooni on olemas Linnutee galaktikas.
//Esimene argument on tähtede moodustamise kiirus galaktikas.
//Teine argument on tähed, mille ümber moodustuvad planeedid.
//Kolmas argument on need planeedid, millel elu on võimalik.
//Neljas argument on  need planeedid, millel elu tekib.
//Viies argument on need planeedid, kus intelligentne elu tekib.
//Kuues argument on need planeedid, kus intelligentne elu ning kes on suutelised kommunikeerima teiste tsivilisatsioonidega.
//Seitsmes argument on aeg, millal selline tsivilisatsioon on märgatav.

//Käsud: java Kodutoo1 4 0.5 0.25 0.2 0.2 0.2 3000000
//Tulemus: Nii mitu tsivilisatsiooni peaks olema meie galaktikas: 12000.0

//Oleneb, kust andmed võta, vastused erinevad väga palju.
