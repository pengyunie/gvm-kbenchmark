/*
Classes O, S, O.A < S. All three have the field v, method f().
  From A call: v, f(), this.v, this.f(), super.v, super.f(), O.this.v, O.this.f(), A.this.v, A.this.f().
*/

public class inner_in_42_hiding_hier {
  public static void main(String[] args) {
    new O().new A().test();
    System.out.println("Done!");
  }
}

class S {
  int v = 1;
  String f() {return "S.f()";}
}

class O {

  int v = 2;
  String f() {return "O.f()";}

  class A extends S {

    int v = 30;
    String f() {return "A.f()";}

    void test() {
      System.out.print("O.A: v          = "); System.out.println( v);
      System.out.print("O.A: f()        = "); System.out.println( f());
      System.out.print("O.A: this.v     = "); System.out.println( this.v);
      System.out.print("O.A: this.f()   = "); System.out.println( this.f());
      System.out.print("O.A: A.this.v   = "); System.out.println( A.this.v);
      System.out.print("O.A: A.this.f() = "); System.out.println( A.this.f());
      System.out.print("O.A: super.v    = "); System.out.println( super.v);
      System.out.print("O.A: super.f()  = "); System.out.println( super.f());
      System.out.print("O.A: O.this.v   = "); System.out.println( O.this.v);
      System.out.print("O.A: O.this.f() = "); System.out.println( O.this.f());
    }
  }
}
