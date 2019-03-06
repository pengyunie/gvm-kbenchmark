/*
Equality: reference
B < A
B b = new B(); A a = new A();
b == b : a == b
b != b : a != b
*/

public class exp_type_22_ref_eq {
  public static void main(String[] args) {
    B b = new B(); A a = new A();

    System.out.print("f(true  ? get(b) == b : get(a) == b): "); System.out.println( f(true  ? get(b) == b : get(a) == b));
    System.out.print("f(false ? get(b) == b : get(a) == b): "); System.out.println( f(false ? get(b) == b : get(a) == b));
    System.out.print("f(true  ? get(b) != b : get(a) != b): "); System.out.println( f(true  ? get(b) != b : get(a) != b));
    System.out.print("f(false ? get(b) != b : get(a) != b): "); System.out.println( f(false ? get(b) != b : get(a) != b));

    System.out.println("Done!");
  }

  static String f(boolean b) {
    return "f(boolean): " + b;
  }

  static Object get(Object o) {
    System.out.print("get("); System.out.print(o ); System.out.println( ")");
    return o;
  }
}

class A {
  public String toString() {
    return "A";
  }
}

class B extends A {
  public String toString() {
    return "B";
  }
}
