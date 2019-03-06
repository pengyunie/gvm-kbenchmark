/*
Static fields default values. Class with fields of all relevant types, without initializer.
Test their values.
*/

class A {
  static byte b;
  static short s;
  static int i;
  static long l;
  static char ch;
  static boolean bool;
  static String str;
  static RuntimeException re;
}

public class static_f_110_default_value {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(A.b ); System.out.print(" "); System.out.print(A.s ); System.out.print(" "); System.out.print(A.i ); System.out.print(" "); System.out.print(A.l ); System.out.print(" "); System.out.print(A.ch ); System.out.print(" "); System.out.print(A.bool
                    ); System.out.print(" "); System.out.print(A.str ); System.out.print(" "); System.out.print(A.re ); System.out.println( " ");
    System.out.println("Done!");
  }
}
