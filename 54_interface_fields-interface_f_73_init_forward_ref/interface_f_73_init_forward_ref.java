/*
Fields with initializer, initializer exps refer to fields declared below. Default values exposed.
*/

interface I1 {
  int a = I1.b;
  int b = a + 10;
  int c = b;
}

public class interface_f_73_init_forward_ref {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(I1.a ); System.out.print(" "); System.out.print(I1.b ); System.out.print(" "); System.out.println( I1.c);
    System.out.println("Done!");
  }
}
