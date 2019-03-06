/*
Additive numeric: +  -
int b = 1; long a = 10;
b + b : a + b
b - b : a - b
*/

public class exp_type_15_int_add {
  public static void main(String[] args) {
    System.out.println("f(true  ? get(10) + 10 : getL(100) + 10): " + f(true  ? get(10) + 10 : getL(100) + 10));
    System.out.println("f(false ? get(10) + 10 : getL(100) + 10): " + f(false ? get(10) + 10 : getL(100) + 10));
    System.out.println("f(true  ? get(10) - 10 : getL(100) - 10): " + f(true  ? get(10) - 10 : getL(100) - 10));
    System.out.println("f(false ? get(10) - 10 : getL(100) - 10): " + f(false ? get(10) - 10 : getL(100) - 10));

    System.out.println("Done!");
  }

  static String f(int b) {
    return "f(int): " + b;
  }

  static String f(long a) {
    return "f(long): " + a;
  }

  static int get(int a) {
    System.out.println("get(" + a + ")");
    return a;
  }

  static long getL(long a) {
    System.out.println("getL(" + a + ")");
    return a;
  }
}
