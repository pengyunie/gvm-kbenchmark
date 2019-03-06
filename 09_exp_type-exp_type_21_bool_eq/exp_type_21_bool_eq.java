/*
Equality: boolean
boolean b = true; boolean a = false;
b == b : a == b
b != b : a != b
*/

public class exp_type_21_bool_eq {
  public static void main(String[] args) {
    boolean b = true; boolean a = false;

    System.out.print("f(true  ? get(true) == true : get(false) == true): "); System.out.println( f(true  ? get(true) == true : get(false) == true));
    System.out.print("f(false ? get(true) == true : get(false) == true): "); System.out.println( f(false ? get(true) == true : get(false) == true));
    System.out.print("f(true  ? get(true) != true : get(false) != true): "); System.out.println( f(true  ? get(true) != true : get(false) != true));
    System.out.print("f(false ? get(true) != true : get(false) != true): "); System.out.println( f(false ? get(true) != true : get(false) != true));

    System.out.println("Done!");
  }

  static String f(boolean b) {
    return "f(boolean): " + b;
  }

  static boolean get(boolean a) {
    System.out.print("get("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}
