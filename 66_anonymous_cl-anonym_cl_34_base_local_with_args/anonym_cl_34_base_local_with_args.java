/*
Base class is a local class in instance context, have traced a constructor with two arguments.
  Anonymous class have a constructor with two arguments - one for each base class arg.
  Anonymous class's test() calls super.test() that prints something from its enclosing class.
  The enclosing object is other than O.this.
*/

public class anonym_cl_34_base_local_with_args {
  public static void main(String[] args) {
    new O(10).test();
    System.out.println("Done!");
  }
}

class O {

  int var;

  O(int var) {
    this.var = var;
  }

  void test() {

    class A {

      int a, b;

      A(int a, int b) {
        System.out.print("A: a = "); System.out.print(a ); System.out.print(", b = "); System.out.println( b);
        this.a = a;
        this.b = b;
      }

      void test() {
        System.out.print("A.test: a = "); System.out.print(a ); System.out.print(", b = "); System.out.print(b ); System.out.print(", O.this.var = "); System.out.println( O.this.var);
      }
    }

    A a = new A(3, 4) {
      public void test() {
        System.out.print("anon: "); System.out.print("O.this.var = "); System.out.println( O.this.var);
        super.test();
      }
    };

    a.test();
  }
}
