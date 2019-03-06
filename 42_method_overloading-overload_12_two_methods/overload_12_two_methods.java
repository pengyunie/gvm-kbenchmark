/*
12. Two overloaded methods:
   f(int), f(int, int), g(int), g(int,int). Call all of them.
*/

public class overload_12_two_methods {

  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

class main {
  main() {
    f(2);
    f(3,9);
    g(4);
    g(5,25);
  }

  void f(int a) {
    System.out.print("f:"); System.out.println(a);
  }

  void f(int a, int b) {
    System.out.print("f:"); System.out.print(a); System.out.print(" "); System.out.println(b);
  }

  void g(int a) {
    System.out.print("g:"); System.out.println(a);
  }

  void g(int a, int b) {
    System.out.print("g:"); System.out.print(a); System.out.print(" "); System.out.println(b);
  }
}
