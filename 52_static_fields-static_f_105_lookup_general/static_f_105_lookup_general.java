/*
Static field lookup, all the forms:
  We have 6 possible expressions:
    - unqualified f in static context
    - unqualified f in instance context
    - this.f
    - object.f
    - Class.f
    - super.f
  combined by two target contexts:
    - field in current class
    - field inherited from superclass.
*/

public class static_f_105_lookup_general {
  public static void main(String[] args) {
    A.sv = 8;

    System.out.println("Static field defined in target class:");
    A a = new A();
    a.staticTestA();
    a.instTestA();
    a.thisQTestA();
    System.out.print("a.sv="); System.out.println(a.sv);
    System.out.print("A.sv="); System.out.println(A.sv);

    System.out.println("\nStatic field defined in subclass:");
    B b = new B();
    b.staticTestB();
    b.instTestB();
    b.thisQTestB();
    System.out.print("b.sv="); System.out.println(b.sv);
    System.out.print("B.sv="); System.out.println(B.sv);

    System.out.println("\nAccess static field with super qualifier:");
    C c = new C();
    b.superQTestB();
    c.superQTestC();

    System.out.println("Done!");
  }
}

class A {
  static int sv;

  void instTestA() {
    System.out.print("(inst A)sv="); System.out.println(sv);
  }

  static void staticTestA() {
    System.out.print("(static A)sv="); System.out.println(sv);
  }

  void thisQTestA() {
    System.out.print("(A)this.sv="); System.out.println(this.sv);
  }
}

class B extends A {

  void instTestB() {
    System.out.print("(inst B)sv="); System.out.println(sv);
  }

  static void staticTestB() {
    System.out.print("(static B)sv="); System.out.println(sv);
  }

  void thisQTestB() {
    System.out.print("(B)this.sv="); System.out.println(this.sv);
  }

  void superQTestB() {
    System.out.print("(B)super.sv="); System.out.println(super.sv);
  }
}

class C extends B {
  void superQTestC() {
    System.out.print("(C)super.sv="); System.out.println(super.sv);
  }
}
