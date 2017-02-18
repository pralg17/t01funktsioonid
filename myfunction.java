public class myfunction {
  public static String zoomScreen(int disX, int disY, double zoom) {
    String x = String.valueOf(Math.round(disX*zoom));
    String y = String.valueOf(Math.round(disY*zoom));
    String output = "X:" + x + " Y:" + y;
    return output;
  }
  public static void main(String[] args) {
    System.out.println(zoomScreen(1366, 768, 1.1));
  }
}

/*
java myfunction
X:1503 Y:845
*/
