/*
instanceof
B < A
Object o = new A
o instanceof A : o instanceof B
*/

public class exp_type_19_instanceof {
  public static void main(String[] args) {
    Object o = new A();
    System.out.print("f(true  ? get(o) instanceof A : get(o) instanceof B): "); System.out.println( f(true  ? get(o) instanceof A : get(o) instanceof B));
    System.out.print("f(false ? get(o) instanceof A : get(o) instanceof B): "); System.out.println( f(false ? get(o) instanceof A : get(o) instanceof B));
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
