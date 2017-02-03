public class Alamprogramm1 {
  public static double sentimeetriteks(double tollid){
    return tollid*2.54;
  }
  public static double tollideks(double sentimeetrid){
    return sentimeetrid/2.54;
  }

  public static double hupotenuus(double kaatet1, double kaatet2){
    //return Math.sqrt((kaatet1*kaatet1)+(kaatet2*kaatet2));
    return Math.sqrt(Math.pow(kaatet1, 2)+ Math.pow(kaatet2, 2));
  }

  public static void main(String[] args){
    double tollidearv=3;

    double sentimeetritearv=sentimeetriteks(tollidearv);
    System.out.println(tollidearv+" tolli on "+sentimeetritearv+" sentimeetrit");

    double tollidearv2=tollideks(sentimeetritearv);
    System.out.println(sentimeetritearv+" sentimeetrit on "+tollidearv2+" tolli");

    System.out.println(String.format("Sentimeetreid: %.2f",tollideks(10)));

    System.out.println("Hypotenuus on "+hupotenuus(3,4));

  }
}
/*
Tulemused
[taankomm@greeny algus]$ java Alamprogramm1
3.0 tolli on 7.62 sentimeetrit
7.62 sentimeetrit on 3.0 tolli
Sentimeetreid: 3.94
Hypotenuus on 5.0 
*/
