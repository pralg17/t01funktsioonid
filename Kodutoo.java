public class Kodutoo{
	
	public static String paariskontroll(int sisend){
		
		if ( sisend % 2 == 0 ){
        return "Sisestatud arv on paaris";
		}else{	
        return "Sisestatud arv on paaritu";
		}
	}
	
	
	
	public static void main(String[] a){
	  try{
		  
		int sisend=Integer.parseInt(a[0]);
		
		System.out.println(paariskontroll(sisend));
		
	  } catch(NumberFormatException veaandmed){
		  System.out.println("Sisend pole arv");
	  } catch(ArrayIndexOutOfBoundsException veaandmed){
		  System.out.println("Puudub sisend");
	  }
	}
}