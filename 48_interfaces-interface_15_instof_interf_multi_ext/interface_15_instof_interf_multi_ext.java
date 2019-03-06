/*
IC < (IA, IB). C < IC, B < IB, A < IA Test instanceof
  among (IA)A, (IB)B, (IC)C on one side and (IA, IB, IC) on other.
*/

public class interface_15_instof_interf_multi_ext {
  public static void main(String[] args) {
    IA a = new A();
    IB b = new B();
    IC c = new C();
    System.out.print("A instanceof IA "); System.out.println( (a instanceof IA));
    System.out.print("A instanceof IB "); System.out.println( (a instanceof IB));
    System.out.print("A instanceof IC "); System.out.println( (a instanceof IC));
    System.out.print("B instanceof IA "); System.out.println( (b instanceof IA));
    System.out.print("B instanceof IB "); System.out.println( (b instanceof IB));
    System.out.print("B instanceof IC "); System.out.println( (b instanceof IC));
    System.out.print("C instanceof IA "); System.out.println( (c instanceof IA));
    System.out.print("C instanceof IB "); System.out.println( (c instanceof IB));
    System.out.print("C instanceof IC "); System.out.println( (c instanceof IC));

    System.out.println("Done!");
  }
}

interface IA {}
interface IB {}
interface IC extends IA, IB {}

class A implements IA {}
class B implements IB {}
class C implements IC {}
