/*
O, O.A. Instantiate inner class from the outer class. Call inner class method test().
  test() instantiates other inner classes of the enclosing class: static class O.B, instance class O.C.
  All referred by simple name.
*/

public class inner_in_15_many_inner_classes {
  public static void main(String[] args) {
    new O(1);
    new O(2);
    System.out.println("Done!");
  }
}

class O {

  int v;

  O(int id) {
    v = id;
    new A().test();
  }

  class A {

    A() {
    }

    void test() {
      System.out.print("O.A: new O.B = "); System.out.println( new B());
      System.out.print("O.A: new O.C = "); System.out.println( new C());
    }
  }

  static class B {
    public String toString() {
      return "B";
    }
  }

  class C {
    public String toString() {
      return "C[v=" + v + "]";
    }
  }
}
