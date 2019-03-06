/*
Interface with a constant initialized with an int value and a traced static initialization.
  Access the constant. Static init should not be triggered.
  Access a non-constant static field. Static init should be triggered.
*/

class const_02_in_interface {
  public static void main(String[] argv) {
    System.out.print("Constant: "); System.out.println( I1.x);
    System.out.print("Regular static: "); System.out.println( I1.y);
    System.out.print("Constant: "); System.out.println( I1.x);
    System.out.println("Done!");
  }
}

interface I1 {
  int x = 3;
  int y = Auxx.traceAndGet(10);
}

class Auxx {
  static int traceAndGet(int a) {
    System.out.print("Trace: "); System.out.println( a);
    return a;
  }
}
