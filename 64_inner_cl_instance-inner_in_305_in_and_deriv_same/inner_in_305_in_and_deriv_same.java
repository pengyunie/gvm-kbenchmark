/*
Superposition of nesting and inheritance. Classes O, O.A < O. In any case the enclosing
  instance of A and the base instance will be different instances.
  Instantiate a from O and from a static context.
  Inside A, discriminate between outer O and base O by using O.this, simple this and super as qualifier,
  also unqualified calls.
*/

public class inner_in_305_in_and_deriv_same {
  public static void main(String[] args) {
    new O(1).new A().test();
    System.out.println("Done!");
  }
}

class O {

  int ov;
  String of() {return "of()";}

  O(int id) {
    ov = id;
  }

  class A extends O {
    int av = 10;
    String af() {return "af()";}

    A() {
      super(2);
    }

    void test() {
      System.out.print("O.A: av          = "); System.out.println( av);
      System.out.print("O.A: af()        = "); System.out.println( af());
      System.out.print("O.A: ov          = "); System.out.println( ov);
      System.out.print("O.A: of()        = "); System.out.println( of());
      System.out.print("O.A: this.ov     = "); System.out.println( this.ov);
      System.out.print("O.A: this.of()   = "); System.out.println( this.of());
      System.out.print("O.A: super.ov    = "); System.out.println( super.ov);
      System.out.print("O.A: super.of()  = "); System.out.println( super.of());
      System.out.print("O.A: O.this.ov   = "); System.out.println( O.this.ov);
      System.out.print("O.A: O.this.of() = "); System.out.println( O.this.of());
    }
  }
}
