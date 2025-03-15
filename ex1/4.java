public class Main {
  public static void main (String[] args ) {
      int start = 5;
      int step =1;
      for(int i = start; i < start + 5 * step; i += step) {
          System.out.print(i * i + " ");
      }
   }
}  
