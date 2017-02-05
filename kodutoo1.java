import java.util.Scanner;

public class kodutoo1{
	public static void main(String[] args){
		 int i,n;
		 Scanner userInputScanner = new Scanner(System.in);
		 System.out.println ("Tere, mis su nimi on?");
		 String userName = userInputScanner.nextLine();
		 System.out.println("Tere "+ userName + ", mitu arvu soovid sisestada?");
		 Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		 int a[] = new int [n];
		 

		 System.out.println("Sisesta arvud: ");
		   for(i=0;i<n;i++){
		   a[i] = sc.nextInt();
		   System.out.println("Sisestasid: " +a[i]);
		 }

		 
		  int sum = 0;
		  for(i=0;i<n;i++){
			sum = sum +a[i];
		 }

		  int biggest = 0;
		  for(i=0;i<n;i++){
			if(a[i]>biggest){
			biggest = a[i];
		  }
		 }

		  int smallest = 1000;
		  for(i=0;i<n;i++){
			if(a[i]<smallest){
			smallest = a[i];
		   }
		 }

		  int avg ;
		  avg = sum/n;

		  System.out.println("Suurim arv : " +biggest);
		  System.out.println("Väikseim arv : " +smallest);
		  System.out.println("Keskmine arv : " +avg);
		  System.out.println("Arvude summa : " +sum);
		  System.out.println("Esimesena sisestatud arv: " +a[0]);
		  System.out.println("Viimasena sisestatud arv:"+a[a.length-1]);

	}
}

/*


[karojyrg@greeny t01funktsioonid]$ javac kodutoo1.java
[karojyrg@greeny t01funktsioonid]$ java kodutoo1
Tere, mis su nimi on?
Kärol-Milaine Jürgenson
Tere Kärol-Milaine Jürgenson, mitu arvu soovid sisestada?
4
Sisesta arvud:
12 76 1 9
Sisestasid: 12
Sisestasid: 76
Sisestasid: 1
Sisestasid: 9
Suurim arv : 76
Väikseim arv : 1
Keskmine arv : 24
Arvude summa : 98
Esimesena sisestatud arv: 12
Viimasena sisestatud arv:9

*/
