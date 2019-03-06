/*
I2 < I1. Fields with initializer, refering to superinterface static fields
  by simple name. Test that superclass fields are initialized.
*/

public class interface_f_81_hier_inheritance {
  public static void main(String[] args) {
    System.out.print("I2.b = "); System.out.println( I2.c);
    System.out.println("Done!");
  }
}

interface I1 {
  int a = Auxx.trace(1);
  int b = Auxx.trace(2);
}

interface I2 extends I1 {
  int c = Auxx.trace(10);
  int d = Auxx.trace(a + 10);
}

class Auxx {
  static int trace(int a) {
    System.out.print("trace("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}
