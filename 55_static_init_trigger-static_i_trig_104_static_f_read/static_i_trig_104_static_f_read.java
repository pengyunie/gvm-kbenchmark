/*
Class initialization conditions.
Class A static field read.
*/

public class static_i_trig_104_static_f_read {
  public static void main(String[] args) {
    System.out.print(A.a ); System.out.print(" "); System.out.println( A.a);
    System.out.println("Done!");
  }
}

class A {

  static {
    System.out.println("A.(static init)");
  }

  static int a = trace(1);

  static int trace(int a) {
    System.out.print("trace("); System.out.print(a); System.out.println(")");
    return a;
  }
}
