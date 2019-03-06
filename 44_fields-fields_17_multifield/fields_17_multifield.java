/*
Multifield. One field declaration with multiple fields.
*/

class A {
  int a,b,c;
}

public class fields_17_multifield {
  public static void main(String[] args) {
    A a = new A();
    a.a = 1;
    a.b = 2;
    a.c = 4;
    System.out.print(""); System.out.print(a.a ); System.out.print(" "); System.out.print(a.b ); System.out.print(" "); System.out.println( a.c);
    System.out.println("Done!");
  }
}
