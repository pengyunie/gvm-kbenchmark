/*
Fields with initializer, some initializer exps refer to fields declared above.
*/

class A {
  static int a = 3;
  static int b = a + 10;
  static int c = A.a + 100;
}

public class static_f_init_102_backward_ref {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(A.a ); System.out.print(" "); System.out.print(A.b ); System.out.print(" "); System.out.println( A.c);
    System.out.println("Done!");
  }
}
