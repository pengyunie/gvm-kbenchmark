/*
24. Unambiguous null  - distinguishing between primitive type and reference.
  - f(long), f(A)
  - call types: int, null
*/

public class overload_24_one_arg_null {

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
    f(null);
  }

  void f(long a) {
    System.out.print("long: "); System.out.println( a);
  }

  void f(A a) {
    System.out.print("A: "); System.out.println( (a != null ? a.getClass().getName() : null));
  }
}
