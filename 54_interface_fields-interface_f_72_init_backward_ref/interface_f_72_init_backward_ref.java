/*
Fields with initializer, some initializer exps refer to fields declared above.
*/

interface I1 {
  int a = 3;
  int b = a + 10;
  int c = I1.a + 100;
}

public class interface_f_72_init_backward_ref {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(I1.a ); System.out.print(" "); System.out.print(I1.b ); System.out.print(" "); System.out.println( I1.c);
    System.out.println("Done!");
  }
}
