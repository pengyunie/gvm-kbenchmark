/*
Fields hiding involving an interface:
  A{static v, u} < I1{v,u}

  Test using all possible expressions.
*/

public class interface_f_24_hiding_direct_class {
  public static void main(String[] args) {
    A a = new A();
    System.out.print("v instance context: ");
    System.out.print(a.v); System.out.print(" "); System.out.print(((I1)a).v); System.out.print(" "); System.out.print(a.getV()); System.out.print(" "); System.out.println(a.getThisV());
    System.out.print("v static context  : ");
    System.out.print(A.v); System.out.print(" "); System.out.print(I1.v); System.out.print(" "); System.out.println(A.staticGetV());
    System.out.print("u instance context: ");
    System.out.print(a.u); System.out.print(" "); System.out.print(((I1)a).u); System.out.print(" "); System.out.print(a.getU()); System.out.print(" "); System.out.println(a.getThisU());

    System.out.println("Done!");
  }
}

interface I1 {
  String v = "I1.v";
  String u = "I1.u";
}

class A implements I1 {

  public static String v = "A.v";
  public String u = "A.u";

  String getV() {
    return v;
  }

  String getThisV() {
    return this.v;
  }

  static String staticGetV() {
    return v;
  }

  String getU() {
    return u;
  }

  String getThisU() {
    return this.u;
  }
}
