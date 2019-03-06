/*
Fields hiding. Subclass/superclass with fields, same name, access from both base and derived class.
*/

class A {
  int a;
  boolean b;
}

class B extends A {
  int a;
}

public class fields_130_hiding {
  public static void main(String[] args) {
    B b = new B();
    b.a = 22;
    b.b = true;
    A a = (A) b;
    a.a = 2;
    System.out.print(a.a ); System.out.print(" "); System.out.print(a.b ); System.out.print(" "); System.out.print(b.a ); System.out.print(" "); System.out.println( b.b);
    System.out.println("Done!");
  }
}
