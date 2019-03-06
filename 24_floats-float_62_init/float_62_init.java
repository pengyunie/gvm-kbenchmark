/*
Initialization of floats.
  - Class with double field. Print the value of (field + 1).
  Will get stuck if double is initialzied as int.
*/

public class float_62_init {

  static double v;

  public static void main(String[] args) {
    System.out.print("v       = "); System.out.println( v);
    System.out.print("v + 0   = "); System.out.println( (v + 0));
    System.out.print("v + 0.0 = "); System.out.println( (v + 0.0));
    System.out.println("Done!");
  }
}
