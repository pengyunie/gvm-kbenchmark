/*
21. One argument, no conversion.
  - f(long), f(String), f(RuntimeException), f(A)
*/

public class overload_21_one_arg_diff_type {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class A {}

class main {
  main() {
    f(2);
    f("abcx");
    f(new RuntimeException());
    f(new A());
  }

  void f(int a) {
    System.out.print("long: "); System.out.println( a);
  }

  void f(String a) {
    System.out.print("String: "); System.out.println( a);
  }

  void f(RuntimeException a) {
    System.out.print("RuntimeException: "); System.out.println( a);
  }

  void f(A a) {
    System.out.println("A");
  }
}
