/*
When method qualifier is null, arguments are still evaluated. Only after that NPE is thrown.
    Call a one-arg method with traced argument, on a null reference. Catch the exception.
*/

public class method_43_np_exception_order {

  public static void main(String[] args) {
    A a = null;
    try {
      a.f(trace(2));
      System.out.println("ok");
    } catch (RuntimeException e) {
      System.out.println(e);
    }

    System.out.println("Done!");
  }

  static int trace(int a) {
    System.out.print("trace("); System.out.print(a ); System.out.println( ")");
    return a;
  }
}

class A {
  A(int a) {
    System.out.print("A.A("); System.out.print(a ); System.out.println( ")");
  }

  void f(int a) {
    System.out.print("A.f("); System.out.print(a ); System.out.println( ")");
  }
}
