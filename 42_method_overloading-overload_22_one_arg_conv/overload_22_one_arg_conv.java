/*
22. One argument, conversion
  - Definitions: f(long), f(String), f(RuntimeException), f(A)
  - calls types: int, NPE, B (B < A).
*/

public class overload_22_one_arg_conv {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class A {
  public String toString() {return "A";}
}

class B extends A {
  public String toString() {return "B";}
}

class main {
  main() {
    f(2);
    f(new NullPointerException());
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

  void f(A a) {
    System.out.print("A: "); System.out.println( a);
  }
}
