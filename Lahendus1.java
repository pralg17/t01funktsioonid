 import java.text.DecimalFormat;
 
 
 public class Lahendus1{
	 
	 
	public static void main(String[] arg){
		 
		System.out.println(naita(5.014565846546546546464646466, 3));
	 } 
			
			
	
	public static String naita(double arv, double pealeKoma){
		
		
		String argument = "#.";
		for(int i=0; i<pealeKoma; i=i+1){
			argument = argument + "#";	
		}
		
		DecimalFormat df = new DecimalFormat(argument);
		String format = df.format(arv);
		return format;
	}
		
 }
	