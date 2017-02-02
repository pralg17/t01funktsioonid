public class Lahendus1 {
   
   public static void main(String[] args) {
      int a = 21;
      int b = 4;
      int c = minArv(a, b);
      System.out.println("Miinimumarv = " + c);
   }

   /** returns the minimum of two numbers */
   public static int minArv(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
  
}