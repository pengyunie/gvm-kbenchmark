/*
B < A < (I1, I2). Test cast and instanceof among
  (A,I1), (A,I2), (B,I1), (B,I2)
*/

public class interface_13_instof_multi_impl {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    System.out.print("A instanceof I1 "); System.out.println( (a instanceof I1));
    System.out.print("A instanceof I2 "); System.out.println( (a instanceof I2));
    System.out.print("B instanceof I1 "); System.out.println( (b instanceof I1));
    System.out.print("B instanceof I2 "); System.out.println( (b instanceof I2));

    System.out.println("Done!");
  }
}

interface I1 {}
interface I2 {}

class A implements I1,I2 {}

class B extends A {}
