/*
Interface initialization is triggered once.
Interface I1. Read a field twice. Trace.
*/

public class static_i_trig_201_i_init_simple {
  public static void main(String[] args) {
    System.out.print("I1.v= "); System.out.println( I1.v);
    System.out.print("I1.v= "); System.out.println( I1.v);
    System.out.println("Done!");
  }
}

interface I1 {
  int v = T.trace(5);
}

class T {
  static int trace(int a) {
    System.out.print("trace("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}
