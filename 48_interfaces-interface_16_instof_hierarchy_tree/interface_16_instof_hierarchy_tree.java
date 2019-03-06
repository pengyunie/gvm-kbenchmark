/*
A < (IA), B < (A, IB1, IB2, IB3). Test that b is instanceof all four interfaces.
*/

public class interface_16_instof_hierarchy_tree {
  public static void main(String[] args) {
    IA b = new B();
    System.out.print("B instanceof IA "); System.out.println( (b instanceof IA));
    System.out.print("B instanceof IB1 "); System.out.println( (b instanceof IB1));
    System.out.print("B instanceof IB2 "); System.out.println( (b instanceof IB2));
    System.out.print("B instanceof IB3 "); System.out.println( (b instanceof IB3));

    System.out.println("Done!");
  }
}

interface IA {}
interface IB1 {}
interface IB2 {}
interface IB3 {}

class A implements IA {}
class B extends A implements IB1, IB2, IB3 {}

