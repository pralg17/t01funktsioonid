public class Funktsioonid{
 	public static float pindala(float a, float b){
    float S = 0;
    S = a*b;
    return S;
 	}
  public static float ymbermoot(float a, float b){
    float P = 0;
    P = 2*(a+b);
    return P;
  }
 	public static void main(String[] args){
    float kylg1=Float.parseFloat(args[0]);
    float kylg2=Float.parseFloat(args[1]);
    float RistPindala = pindala(kylg1, kylg2);
    float RistYmber = ymbermoot(kylg1, kylg2);
    System.out.println("Ristküliku pindala on " + RistPindala);
    System.out.println("Ristküliku ümbermõõt on " + RistYmber);
 	}
 }
