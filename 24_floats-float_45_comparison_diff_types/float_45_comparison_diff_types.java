/*
Comparison among different numeric types:
  - float == double
  - double == float
  - float == int
  - double == int
  - int == double
  - double == long
  - long == double
  - int == long
  - float != double
  - double != int
*/

public class float_45_comparison_diff_types {
  public static void main(String[] args) {
    float f = (float)0.0;
    double d = 0.0;
    int i = 0;
    long l = 0;
    System.out.println("All values are 0.");

    System.out.print("float == double: "); System.out.println( (f == d));
    System.out.print("double == float: "); System.out.println( (d == f));
    System.out.print("float == int: "); System.out.println( (f == i));
    System.out.print("double == int: "); System.out.println( (d == i));
    System.out.print("int == double: "); System.out.println( (i == d));
    System.out.print("double == long: "); System.out.println( (d == l));
    System.out.print("long == double: "); System.out.println( (l == d));
    System.out.print("int == long: "); System.out.println( (i == l));
    System.out.print("float != double: "); System.out.println( (f != d));
    System.out.print("double != int: "); System.out.println( (d != i));

    System.out.println("Done!");
  }
}
