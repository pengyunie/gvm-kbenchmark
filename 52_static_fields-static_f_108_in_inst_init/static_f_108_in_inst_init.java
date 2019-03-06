/*
Unqualified static fields in instance initializing contexts.
  Access a static field through unqualified expression in:
  - instance field initializer
  - instance initializer
  - super() call
  - constructor
*/

public class static_f_108_in_inst_init {
  public static void main(String[] args) {
    A.sv = 14;
    new B();
    System.out.println("Done!");
  }
}

class A {
  A(int a) {
    System.out.print("A.A("); System.out.print(a); System.out.println(")");
  }

  static int sv;
}

class B extends A {
  int v = sv;

  {
    System.out.print("inst init: "); System.out.println(sv);
  }

  B() {
    super(sv);
    System.out.print("constructor: "); System.out.print(sv); System.out.print(", v="); System.out.println(v);
  }
}

