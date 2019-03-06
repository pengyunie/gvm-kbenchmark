/*
Overloading with interfaces as method arguments.
  IC < (IA, IB) < IMax. A < IA ; B < (IB, IMax); C < (IB, IC).
  Tester: have an f(IA), f(IB), f(IC), f(IMax). Call it with arguments
  of static type A, B, C, IA, IB, IC, IMax.
*/

public class interface_61_class_subtype_of_intf_diamond {
  public static void main(String[] args) {
    Tester t = new Tester();
    System.out.print("f(IA):   "); System.out.println( t.f((IA)null));
    System.out.print("f(IB):   "); System.out.println( t.f((IB)null));
    System.out.print("f(IC):   "); System.out.println( t.f((IC)null));
    System.out.print("f(IMax): "); System.out.println( t.f((IMax)null));
    System.out.print("f(A):    "); System.out.println( t.f( (A)null));
    System.out.print("f(B):    "); System.out.println( t.f( (B)null));
    System.out.print("f(C):    "); System.out.println( t.f( (C)null));

    System.out.println("Done!");
  }
}

interface IMax {}
interface IA extends IMax {}
interface IB extends IMax {}
interface IC extends IA, IB {}

class A implements IA {}
class B implements IB, IMax {}
class C implements IB, IC {}

class Tester {
  String f(IA x) {
    return "f(IA)";
  }

  String f(IB x) {
    return "f(IB)";
  }

  String f(IC x) {
    return "f(IC)";
  }

  String f(IMax x) {
    return "f(IMax)";
  }
}

