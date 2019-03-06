/*
Multifield with init. two groups of three fields each:
  int a, b=..., c;
  int d=..., e, f=...;
  Test their values.
*/

class A {
  int a, b=1, c;
  long d=100, e, f=101;
}

public class field_init_211_multifield {
  public static void main(String[] args) {
    A a = new A();
    System.out.print(""); System.out.print(a.a ); System.out.print(" "); System.out.print(a.b ); System.out.print(" "); System.out.print(a.c ); System.out.print(" "); System.out.print(a.d ); System.out.print(" "); System.out.print(a.e ); System.out.print(" "); System.out.println( a.f);
    System.out.println("Done!");
  }
}
