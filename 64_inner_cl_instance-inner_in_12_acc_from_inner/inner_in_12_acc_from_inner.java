/*
O, O.A. Instantiate inner class from the outer class. Inner class constructor accesses its members:
  field, method.
*/

public class inner_in_12_acc_from_inner {
  public static void main(String[] args) {
    new O();
    System.out.println("Done!");
  }
}

class O {

  O() {
    new A();
  }

  class A {
    int v = 1;
    String f() {return "f()";}

    A() {
      System.out.print("O.A: v   = "); System.out.println( v);
      System.out.print("O.A: f() = "); System.out.println( f());
    }
  }
}
