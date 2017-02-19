import java.util.Scanner;

public class Pizza{

    static double diameeter(double diameeter) {
        return diameeter / 4;
    }
    static double lisand(double lisand) {
        return lisand * 0.5;
    }


    public static void main(String[] arg){

        Scanner scan = new Scanner (System.in);
        System.out.println("Palun esitage oma pitsa tellimus");

        System.out.println("Kui suure diameetriga pitsat soovid ?(cm)");
        int d = scan.nextInt();

        System.out.println("Mitut lisandit soovid pitsa peale ?");
        int l = scan.nextInt();

        System.out.println("Tellimus vastuvõetud?");
        System.out.println("Pitsa diameetriga "+ d +"cm ja "+ l +" lisandiga maksab "+ (diameeter(d)+lisand(l)) +"€");
    }
}
/*
Palun esitage oma pitsa tellimus
Kui suure diameetriga pitsat soovid ?(cm)
30
Mitut lisandit soovid pitsa peale ?
4
Tellimus vastuvõetud?
Pitsa diameetriga 30cm ja 4 lisandiga maksab 9.5€

Tanel Otsa
*/