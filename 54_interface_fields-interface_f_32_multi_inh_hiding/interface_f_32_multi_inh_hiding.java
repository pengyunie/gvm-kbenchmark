/*
A{c} < I2{b}, I1{a} - access all through class qualifiers and unqualified in A,
    static and dynamic context.
*/

public class interface_f_32_multi_inh_hiding {
  public static void main(String[] args) {
    System.out.print(A.a ); System.out.print(" "); System.out.print(A.b ); System.out.print(" "); System.out.println(A.c);
    A.staticPrint();
    new A().print();
    System.out.println("Done!");
  }
}

interface I1 {
  int a = 1;
}

interface I2 {
  int b = 2;
}

class A implements I1, I2 {
  static int c = 3;

  void print() {
    System.out.print(a ); System.out.print(" "); System.out.print(b ); System.out.print(" "); System.out.println( c);
  }

  static void staticPrint() {
    System.out.print(a ); System.out.print(" "); System.out.print(b ); System.out.print(" "); System.out.println( c);
  }
}
