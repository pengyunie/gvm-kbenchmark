/*
Calling this() from a local class. Instantiating the local class with both constructor arguments.
*/

public class local_cl_951_cons_this {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class O {

  void test() {

    final int a = 1, b = 10;

    class Local {
      Local() {
        this(20);
      }

      Local(int b) {
        System.out.print("Local: a = "); System.out.print(a ); System.out.print(", b = "); System.out.println( b);
      }
    }

    new Local();
    new Local(30);
  }
}
