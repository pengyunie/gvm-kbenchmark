/*
11. Same name, distinct argument number, exact call arguments type.
  - f(int, int, int)
  - f(int, int)
  - f(Object[])
  Call all with exact arg types.
*/

public class overload_11_diff_arg_num {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class main {
  main() {
    f(2,4,8);
    f(3,9);
    f(new Object[6]);
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
