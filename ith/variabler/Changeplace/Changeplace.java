public class Changeplace {
   public static void main(String[] args) {
      int a = 8;
      int b = 9;
      int temp = a;
      a = b;
      b = temp;

      System.out.println(a);
      System.out.println(b);
   }
}