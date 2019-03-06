/*
Class init triggers superclass init.
B < A. Static and instance init tracing. Instantiate B.
*/

public class static_i_trig_108_hier_instantiate {
  public static void main(String[] args) {
    new B();
    System.out.println("Done!");
  }
}

class A {

  {
    System.out.println("A.(inst init)");
  }

  static {
    System.out.println("A.(static init)");
  }

  static int trace(int a) {
    System.out.print("trace("); System.out.print(a ); System.out.println( ")");
    return a;
  }

  A() {
    System.out.println("A.A()");
  }
}

class B extends A {

  {
    System.out.println("B.(inst init)");
  }

  static {
    System.out.println("B.(static init)");
  }

  B() {
    System.out.println("B.B()");
  }
}
