import java.io.*;

public class TaisnurkneKolmnurk {
    public static float pindala(float c, float d){

        float s2 = (c * d)/2;

        return s2;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("See programm arvutab täisnurkse kolmnurka pindala");
        System.out.println("Sisestage esimene kaatet");
        String kateet1 = reader.readLine();
        float a = Float.parseFloat(kateet1);

        System.out.println("Sisestage teine kaatet");

    String kateet2 = reader.readLine();
    float b = Float.parseFloat(kateet2);

    float s = pindala(a, b);


        System.out.println("Kolmnurka pindala on " + s);
    }
}
