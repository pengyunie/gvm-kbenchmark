/*
Local var collision between contructor argument "v" and a field "v" inside instance init.
  class A:
  - field v
  - instance init printing v
  - constructor with arg v.
*/

class A {

  String v = "field:v";

  {
    System.out.print("A.IInit: v = "); System.out.println( v);
  }

  A(String v) {
    System.out.print("A.A: v = "); System.out.println( v);
  }
}

public class constr_73_constr_iinit_var_col_2 {
  public static void main(String[] args) {
    new A("arg:v");
    System.out.println("Done!");
  }
}
