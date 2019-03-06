/*
23. One argument, some methods share compatible values, but for the used calls
  just one method is applicable.
  - Definitions: Definitions: f(long), f(String), f(RuntimeException), f(NPE), f(A)
  - calls types: int, B (B < A).
*/

public class overload_23_one_arg_mixed {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class A {}
class B extends A {}

class main {
  main() {
    f(2);
    f(new B());
  }

  void f(long a) {
    System.out.print("long: "); System.out.println( a);
  }

  void f(String a) {
    System.out.print("String: "); System.out.println( a);
  }

  void f(RuntimeException a) {
    System.out.print("RuntimeException: "); System.out.println( a);
  }

  void f(NullPointerException a) {
    System.out.print("NullPointerException: "); System.out.println( a);
  }

  void f(A a) {
    System.out.print("A: "); System.out.println( a.getClass().getName());
  }
}
