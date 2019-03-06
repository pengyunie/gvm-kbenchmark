/*
Method arguments are evaluated left-to-right.
    Call a method with 5 arguments, all different and traced.
*/

public class method_44_arg_order {

  public static void main(String[] args) {
    new A(trace(10)).f(trace(1), trace(2), trace(3), trace(4), trace(5));

    System.out.println("Done!");
  }

  static int trace(int a) {
    System.out.print("trace("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}

class A {
  A(int a) {
    System.out.print("A.A("); System.out.print(a ); System.out.println( ")");
  }

  void f(int a, int b, int c, int d, int e) {
    System.out.print("A.f("); System.out.print(a ); System.out.print(","); System.out.print(b ); System.out.print(","); System.out.print(c ); System.out.print(","); System.out.print(d ); System.out.print(","); System.out.print(e ); System.out.println( ")");
  }
}
