/*
Multifield with init. two groups of three fields each:
  int a, b=..., c;
  int d=..., e, f=...;
  Test their values.
*/

class A {
  static int a, b=1, c;
  static long d=100, e, f=101;
}

public class static_f_init_108_multifield {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(A.a ); System.out.print(" "); System.out.print(A.b ); System.out.print(" "); System.out.print(A.c ); System.out.print(" "); System.out.print(A.d ); System.out.print(" "); System.out.print(A.e ); System.out.print(" "); System.out.println( A.f);
    System.out.println("Done!");
  }
}
