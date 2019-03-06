/*
Derived class constructor calls base class constructor through super().
*/

class A {
  A(int a) {
    System.out.print("A("); System.out.print(a ); System.out.println( ")");
  }
}

class B extends A {
  B(int a) {
    super(a);
    System.out.print("B("); System.out.print(a ); System.out.println( ")");
  }
}

public class constr_58_super {
  public static void main(String[] args) {
    new B(1);
    System.out.println("Done!");
  }
}
