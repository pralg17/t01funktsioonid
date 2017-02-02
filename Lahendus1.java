 import java.text.DecimalFormat;
 
 
 public class Lahendus1{
	 
	 
	public static void main(String[] arg){
		 
		double arv = Double.parseDouble(arg[0]);
		double komakoht = Double.parseDouble(arg[1]);
		String argument = "#.";
		for(int i=0; i<komakoht; i=i+1){
			argument = argument + "#";	
		}
		
		DecimalFormat df = new DecimalFormat(argument);
		String format = df.format(arv);
		System.out.println(format);
	 } 
			

 }
	