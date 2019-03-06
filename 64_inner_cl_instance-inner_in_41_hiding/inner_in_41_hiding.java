/*
Field and method hiding. O, O.A, O.A.B. O.v, O.f(), A.v, A.f(), B.v, B.f()
  From B, call v, f() by simple name, by using this, by using B.this, A.this, O.this.
*/

public class inner_in_41_hiding {
  public static void main(String[] args) {
    new O().new A().new B().test();
    System.out.println("Done!");
  }
}

class O {

  int v = 1;
  String f() {return "O.f()";}

  class A {

    int v = 20;
    String f() {return "A.f()";}

    class B {

      int v = 300;
      String f() {return "B.f()";}

      void test() {
        System.out.print("O.A.B: v          = "); System.out.println( v);
        System.out.print("O.A.B: f()        = "); System.out.println( f());
        System.out.print("O.A.B: this.v     = "); System.out.println( this.v);
        System.out.print("O.A.B: this.f()   = "); System.out.println( this.f());
        System.out.print("O.A.B: B.this.v   = "); System.out.println( B.this.v);
        System.out.print("O.A.B: B.this.f() = "); System.out.println( B.this.f());
        System.out.print("O.A.B: A.this.v   = "); System.out.println( A.this.v);
        System.out.print("O.A.B: A.this.f() = "); System.out.println( A.this.f());
        System.out.print("O.A.B: O.this.v   = "); System.out.println( O.this.v);
        System.out.print("O.A.B: O.this.f() = "); System.out.println( O.this.f());
      }
    }
  }
}
