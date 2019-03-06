/*
Interface fields having modifiers:
    - public static final
    - final static public
    - public
    - static
    - final
    - (none)
    Possible expressions: Interface qualifier.
*/

public class interface_f_16_modifiers {
  public static void main(String[] args) {
    System.out.print(I1.a ); System.out.print(" "); System.out.print(I1.b ); System.out.print(" "); System.out.print(I1.c ); System.out.print(" "); System.out.print(I1.d ); System.out.print(" "); System.out.print(I1.e ); System.out.print(" "); System.out.println( I1.f);
    System.out.println("Done!");
  }
}

interface I1 {
  public static final int a = 1;
  final static public int b = 2;
  public int c = 3;
  static int d = 4;
  final int e = 5;
  int f = 6;
}
