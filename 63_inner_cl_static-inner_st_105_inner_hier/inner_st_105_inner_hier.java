/*
Inner class as derived class.
  classes A, B, A.Inner < B.
  B members:
    - String a
    - String f()
    - String g()
  A.Inner members:
    - String a
    - String f()

  print a, f(), g() on targets (A.Inner)A.Inner and (B)A.Inner.
*/

public class inner_st_105_inner_hier {

  public static void main(String[] args) {
    A.Inner inner = new A.Inner();
    System.out.print("(A.Inner): "); System.out.print(inner.a ); System.out.print(" "); System.out.print(inner.f() ); System.out.print(" "); System.out.println( inner.g());
    B b = inner;
    System.out.print("(B)      : "); System.out.print(b.a ); System.out.print(" "); System.out.print(b.f() ); System.out.print(" "); System.out.println( b.g());
    System.out.println("Done!");
  }
}

class A {

  public static class Inner extends B {

    String a = "A.Inner.a";

    String f() {return "A.Inner.f()";}

  }
}

class B {
  String a = "B.a";

  String f() {return "B.f()";}

  String g() {return "B.g()";}
}
