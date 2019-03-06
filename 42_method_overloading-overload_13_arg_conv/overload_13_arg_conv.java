/*
13. Same name, distinct arguments number, call arguments conversion.
  - f(int, int, int)
  - f(int, int)
  - f(Object[])
*/

public class overload_13_arg_conv {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class main {
  main() {
    f((short)2,4,(short)8);
    f(3,(byte)9);
    f(new RuntimeException[6]);
  }

  void f(int a, int b, int c) {
    System.out.print(a); System.out.print(" "); System.out.print(b); System.out.print(" "); System.out.println(c);
  }

  void f(int a, int b) {
    System.out.print(a); System.out.print(" "); System.out.println(b);
  }

  void f(Object[] v) {
    System.out.print("Object[] length: "); System.out.println(v.length);
  }
}
