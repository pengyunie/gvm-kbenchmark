/*
Multiple inheritance, no ambiguities.
  I3{d} < I2{c}, I1{a,b} - access all through interface qualifiers.
*/

public class interface_f_31_multi_inh_no_hiding {
  public static void main(String[] args) {
    System.out.print(I3.a ); System.out.print(" "); System.out.print(I3.b ); System.out.print(" "); System.out.print(I3.c ); System.out.print(" "); System.out.println( I3.d);
    System.out.println("Done!");
  }
}

interface I1 {
  int a = 1;
  int b = 2;
}

interface I2 {
  int c = 3;
}

interface I3 extends I1, I2 {
  int d = 4;
}
