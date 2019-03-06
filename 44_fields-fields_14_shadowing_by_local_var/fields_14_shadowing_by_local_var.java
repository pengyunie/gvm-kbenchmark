/*
Local var hiding a field. Class with a field, method with a local var with the same name.
Access both from within and outside var scope. Also use this.field.
*/

class A {
  int a = 2;

  void f() {
    {
      int a = 7;
      System.out.print("f().a = "); System.out.println( a);
      System.out.print("this.a = "); System.out.println( this.a);
    }
    System.out.print("A.a = "); System.out.println( a);
  }
}

public class fields_14_shadowing_by_local_var {
  public static void main(String[] args) {
    new A().f();
    System.out.println("Done!");
  }
}
