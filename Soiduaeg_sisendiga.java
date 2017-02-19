import java.util.Scanner;
public class Soiduaeg_sisendiga {
  //Sõidule kuluv aeg
  public static double soiduaeg(double teepikkus, double keskminekiirus){
  return teepikkus/keskminekiirus;}

  //Saadud aja minutid e. jääk
  public static double minutid(double soiduaeg) {
    return (soiduaeg*60)%60;
  }

  //Saadud aja tunnid
  public static double tunnid(double soiduaeg, double minutid){
    return ((soiduaeg*60)-minutid)/60;

  }

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    //Vahemaa sisestus
    System.out.println("Sisesta teekonna pikkus (km): ");
    double teepikkus = in.nextDouble();

    //Keskmise kiiruse sisestus
    System.out.println("Sisesta oma eeldatav keskmine kiirus (km/h).(NB! Maanteel ca 90km/h, linnas ca 50km/h)");
    double keskminekiirus = in.nextDouble();

    double soiduaeg=soiduaeg(teepikkus, keskminekiirus);
    double minutid=minutid(soiduaeg);
    double tunnid=tunnid(soiduaeg, minutid);

    System.out.println(String.format("Reisiks kulub %.0f h ja %.0f min.",tunnid, minutid));

  }

}

/*
Tulemused:
[taankomm@greeny t01funktsioonid_Taaniel_K6mmus]$ java Soiduaeg_sisendiga
Sisesta teekonna pikkus (km):
165.4
Sisesta oma eeldatav keskmine kiirus (km/h).(NB! Maanteel ca 90km/h, linnas ca 50km/h)
94.4
Reisiks kulub 1 h ja 45 min.
*/
