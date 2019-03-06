/*
Composite class-qualified expressions.
  Class A. Test the expressions:
  - val = A.b.c
  - A.b.c = val
*/

public class static_f_111_class_qual_composite {
  public static void main(String[] args) {
    System.out.print("A.b.c init= "); System.out.println( A.b.c);
    A.b.c = "A.b.c";
    System.out.print("A.b.c after assign= "); System.out.println( A.b.c);
    System.out.println("Done!");
  }
}

class A {
  static B b = new B();
}

class B {
  String c;
}
