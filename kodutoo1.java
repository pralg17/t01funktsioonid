import java.util.Scanner;

public class kodutoo1{
	public static int summa(int[] a){
		  int sum = 0;
		  for(int i=0;i<a.length;i++){
			sum = sum +a[i];
		 }
         return sum;
	}
	public static int suurim(int[]a){
		int biggest = 0;
		  for(int i=0;i<a.length;i++){
			if(a[i]>biggest){
			biggest = a[i];
		  }
		 }
		 return biggest;
	}
	
	public static int vaikseim(int[]a){
		int smallest = 1000;
		  for(int i=0;i<a.length;i++){
			if(a[i]<smallest){
			smallest = a[i];
		   }
		 }
		 return smallest;
	}
	public static int keskmine(int[]a){
		int avg ;
		  avg = summa(a)/a.length;
		return avg;  
	}
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

		  int sum=summa(a);
		  int biggest=suurim(a);
		  int smallest =vaikseim(a);
		  int avg=keskmine(a);





		  System.out.println("Suurim arv : " +biggest);
		  System.out.println("Väikseim arv : " +smallest);
		  System.out.println("Keskmine arv : " +avg);
		  System.out.println("Arvude summa : " +sum);
		  System.out.println("Esimesena sisestatud arv: " +a[0]);
		  System.out.println("Viimasena sisestatud arv:"+a[a.length-1]);

	}
	
}

/*



Tere, mis su nimi on?
kärol
Tere kärol, mitu arvu soovid sisestada?
3
Sisesta arvud:
12 37 65
Sisestasid: 12
Sisestasid: 37
Sisestasid: 65
Suurim arv : 65
Väikseim arv : 12
Keskmine arv : 38
Arvude summa : 114
Esimesena sisestatud arv: 12
Viimasena sisestatud arv:65


*/
