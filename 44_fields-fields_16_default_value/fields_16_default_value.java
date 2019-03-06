/*
Field default values. Class with fields of all relevant types, without initializer.
Test their value.
*/

class A {
  byte b;
  short s;
  int i;
  long l;
  char ch;
  boolean bool;
  String str;
  RuntimeException re;
}

public class fields_16_default_value {
  public static void main(String[] args) {
    A a = new A();
    System.out.print(""); System.out.print(a.b ); System.out.print(" "); System.out.print(a.s ); System.out.print(" "); System.out.print(a.i ); System.out.print(" "); System.out.print(a.l ); System.out.print(" "); System.out.print(a.ch ); System.out.print(" "); System.out.print(a.bool
                    ); System.out.print(" "); System.out.print(a.str ); System.out.print(" "); System.out.print(a.re ); System.out.println( " ");
    System.out.println("Done!");
  }
}
