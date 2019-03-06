/*
Fields with initializer, some initializer exps refer to fields declared above.
*/

class A {
  int a = 3;
  int b = a + 10;
  int c = this.a + 100;
}

public class field_init_202_backward_ref {
  public static void main(String[] args) {
    A a = new A();
    System.out.print(""); System.out.print(a.a ); System.out.print(" "); System.out.print(a.b ); System.out.print(" "); System.out.println( a.c);
    System.out.println("Done!");
  }
}
