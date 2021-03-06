/*
Access to an interface field. Through a class implementing indirectly the defining interface.
    Possible expressions:
    - class qualifier,
    - class ref qualifier
    - unqualified in static context
    - unqualified in instance context
    - through "this" in instance context
*/

public class interface_f_15_class_sub_i_target {
  public static void main(String[] args) {
    A a = new A();
    System.out.print(A.v ); System.out.print(" "); System.out.print(a.v ); System.out.print(" "); System.out.print(A.staticGetV() ); System.out.print(" "); System.out.print(a.getV()
      ); System.out.print(" "); System.out.println( a.getThisV());
    System.out.println("Done!");
  }
}

interface I1 {
  static int v = 12;
}

interface I2 extends I1 {}

class A implements I2 {

  static int staticGetV() {
    return v;
  }

  int getV() {
    return v;
  }

  int getThisV() {
    return this.v;
  }
}
