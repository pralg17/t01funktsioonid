public class kodutoo1{
	public static void main(String[] args){
		int[] pikkused={109,165,199,175};
		System.out.println("Esimene pikkus: " +pikkused[0]);
		System.out.println("Viimane pikkus: "+pikkused[pikkused. length-1]);
		System.out.println("Pikkuseid kokku: "+pikkused.length);
		
		int summa=0;
		for(int i=0;i<pikkused.length;i++){
			summa=pikkused[i]+summa;
		}
		System.out.println("Pikkuste summa: "+summa);
		System.out.println("Keskmine pikkus: "+summa*1.0/pikkused.length);
	}
}


//[karojyrg@greeny t01funktsioonid]$ java kodutoo1
//Esimene pikkus: 109
//Viimane pikkus: 175
//Pikkuseid kokku: 4
//Pikkuste summa: 648
//Keskmine pikkus: 162.0
