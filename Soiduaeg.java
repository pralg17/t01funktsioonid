public class Soiduaeg {
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

    double teepikkus = Double.parseDouble(args[0]);
    double keskminekiirus = Double.parseDouble(args[1]);


    double soiduaeg=soiduaeg(teepikkus, keskminekiirus);
    double minutid=minutid(soiduaeg);
    double tunnid=tunnid(soiduaeg, minutid);

    System.out.println(String.format("Reisiks kulub %.0f h ja %.0f min.",tunnid, minutid));

  }

}
/*Tulemused:
[taankomm@greeny t01funktsioonid_Taaniel_K6mmus]$ java Soiduaeg 165.4 94.4
Reisiks kulub 1 h ja 45 min.
*/
