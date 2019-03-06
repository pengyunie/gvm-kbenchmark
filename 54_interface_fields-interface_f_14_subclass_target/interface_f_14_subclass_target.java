/*
Access to an interface field.
  Through a class extending a class implementing the defining interface.
    Possible expressions:
    - class qualifier,
    - class ref qualifier
    - unqualified in static context
    - unqualified in instance context
    - through "this" in instance context
    - through "super" in instance context
*/

public class interface_f_14_subclass_target {
  public static void main(String[] args) {
    B b = new B();
    System.out.print(B.v ); System.out.print(" "); System.out.print(b.v ); System.out.print(" "); System.out.print(B.staticGetV() ); System.out.print(" "); System.out.print(b.getV()
      ); System.out.print(" "); System.out.print(b.getThisV() ); System.out.print(" "); System.out.println( b.getSuperV());
    System.out.println("Done!");
  }
}

interface I1 {
  int v = 12;
}

class A implements I1{}

class B extends A {

  static int staticGetV() {
    return v;
  }

  int getV() {
    return v;
  }

  int getThisV() {
    return this.v;
  }

  int getSuperV() {
    return super.v;
  }
}
