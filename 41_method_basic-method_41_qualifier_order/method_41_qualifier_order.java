/*
Method qualifier is evaluated prior to arguments.
    Call a one-arg method with a traced qualifier and traced argument.
*/

public class method_41_qualifier_order {

  public static void main(String[] args) {
    new A(trace(10)).f(trace(2));

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
