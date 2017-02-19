import java.util.*;

class FtoC{
  public static void main(String[] args) {
    
	float temperatue;
    
	Scanner in = new Scanner(System.in);      
 
    System.out.println("Sisestage F temperatuur");
    temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperatuur for normal people = " + temperatue);
  }
}

