/*
Two classes with initializer, field with initializer and constructor.
  Trace execution within initializer, fields init, constructor.
  and super call expression. Fields and constructor arguments have the same name.
  Fields in derived class hide fields in the base class.
*/

class A {

  int a = new Tracer().f(1);

  {
    System.out.println("A.init");
  }

  int b = new Tracer().f(2);

  A(int a) {
    System.out.print("A.A("); System.out.print(a); System.out.println(")");
    System.out.print("A.A: this.a = "); System.out.println(this.a);
    System.out.print("A.A: this.b = "); System.out.println(this.b);
  }
}

class B extends A {
  {
    System.out.println("B.init 1");
  }

  int a = new Tracer().f(3);

  {
    System.out.println("B.init 2");
  }

  B(int a) {
    super(new Tracer().f(4));
    System.out.print("B.B("); System.out.print(a); System.out.println(")");
    System.out.print("B.B: this.a = "); System.out.println(this.a);
    System.out.print("B.B: this.b = "); System.out.println(this.b);
    System.out.print("B.B: super.a = "); System.out.println(super.a);
  }
}

class Tracer {
  int f(int a) {
    System.out.print("Tracer.f("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}

public class constr_56_init_hiding_tracing {
  public static void main(String[] args) {
    B b = new B(new Tracer().f(5));
    System.out.println("Done!");
  }
}
