/*
A < InterSub < InterBase. Test cast and instanceof among all three pairs
  where possible.
*/

public class interface_14_instof_interf_extends {
  public static void main(String[] args) {
    A a = new A();
    System.out.print("A instanceof InterBase "); System.out.println( (a instanceof InterBase));
    System.out.print("A instanceof InterSub "); System.out.println( (a instanceof InterSub));
    InterBase ib = a;
    try {
      InterSub aux = (InterSub)ib;
      System.out.println("(InterSub)(InterBase)A ok");
    } catch (ClassCastException e){
      System.out.println("(InterSub)(InterBase)A exception");
    }

    System.out.println("Done!");
  }
}

interface InterBase {}
interface InterSub extends InterBase {}

class A implements InterSub {}

