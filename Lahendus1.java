import java.text.DecimalFormat;


public class Lahendus1 {

    public static void main(String[] arg) {

        System.out.println(komaKoht(arg[0], arg[1]));

    }

    private static String komaKoht(String arv, String pealekoma){

        double arv1 = Double.parseDouble(arv);
        double komakoht = Double.parseDouble(pealekoma);
        String argument = "#.";

      	for(int i=0; i<komakoht; i=i+1){
        argument = argument + "#";
      	}

        DecimalFormat df = new DecimalFormat(argument);
        return df.format(arv1);
}


}
 
	