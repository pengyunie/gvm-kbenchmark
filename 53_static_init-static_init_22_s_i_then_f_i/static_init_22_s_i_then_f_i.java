/*
Static initializer, then field initializer, initializing the same field.
*/

class A {

  static {
    System.out.print("inst init begin, a = "); System.out.println( A.a);
    a = 3;
  }

  static int a = 2;

  static void f() {
    System.out.print("A.f(): a = "); System.out.println( a);
  }
}

public class static_init_22_s_i_then_f_i {
  public static void main(String[] args) {
    A.f();
    System.out.println("Done!");
  }
}
