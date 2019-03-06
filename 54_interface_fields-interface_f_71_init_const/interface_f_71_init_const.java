/*
Fileds with initializer, all initialized with a constant expression.
*/

interface I1 {
  int a = 2;
  int b = 4 + 5;
  int c = (int) 9876543210L;
}

public class interface_f_71_init_const {
  public static void main(String[] args) {
    System.out.print(""); System.out.print(I1.a ); System.out.print(" "); System.out.print(I1.b ); System.out.print(" "); System.out.println( I1.c);
    System.out.println("Done!");
  }
}
