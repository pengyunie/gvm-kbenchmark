/*
Classes O, O.A, B < O.A. Instantiate B from static context.
  B should have two constructors: One calling with no arguments, calling the second one with this(new O()),
  the second one with an argument O, calling o.super() - a qualified superclass constructor call. Use both constructors.
*/

public class inner_in_304_top_cl_deriv_inner {
  public static void main(String[] args) {
    System.out.println("new B(new O(1)).test():");
    new B(new O(1)).test();
    System.out.println();
    System.out.println("new B().test():");
    new B().test();
    System.out.println("Done!");
  }
}

class O {

  int ov;
  String of() {return "of()";}

  O(int id) {
    ov = id;
  }

  class A {
    int av = 10;
    String af() {return "O[ov=" + ov + "].af()";}
  }
}

class B extends O.A {
  int bv = 20;
  String bf() {return "bf()";}

  B() {
    new O(0).super();
  }

  B(O o) {
    o.super();
  }

  void test() {
    System.out.print("O.B: av   = "); System.out.println( av);
    System.out.print("O.B: af() = "); System.out.println( af());
    System.out.print("O.B: bv   = "); System.out.println( bv);
    System.out.print("O.B: bf() = "); System.out.println( bf());
  }
}