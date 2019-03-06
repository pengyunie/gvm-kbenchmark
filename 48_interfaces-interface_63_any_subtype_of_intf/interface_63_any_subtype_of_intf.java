/*
Interfaces and others subtype of interface.
  Class A < IA, IC < IB < IA.
  Class Tester, method f() with the following argument types:
    - Object, IA, IA[], IA[][], IC[], long, boolean.
    - call arguments: all primitive types, Object, Object[], IA, IA[], IA[][], IA[][][],
      IB, IB[], IB[][], IB[][][], IC, IC[], IC[][], A, A[][], A[][][], String, String[],
      RuntimeException, int[], IOther, IOther[][].
*/

public class interface_63_any_subtype_of_intf {
  public static void main(String[] args) {
    Tester t = new Tester();
    System.out.print("f(byte):             "); System.out.println( t.f((byte)0));
    System.out.print("f(short):            "); System.out.println( t.f((short)0));
    System.out.print("f(int):              "); System.out.println( t.f((int)0));
    System.out.print("f(long):             "); System.out.println( t.f((long)0));
    System.out.print("f(char):             "); System.out.println( t.f((char)0));
    System.out.print("f(boolean):          "); System.out.println( t.f((boolean)false));
    System.out.print("f(Object):           "); System.out.println( t.f((Object)null));
    System.out.print("f(Object[]):         "); System.out.println( t.f((Object[])null));
    System.out.print("f(IA):               "); System.out.println( t.f((IA)null));
    System.out.print("f(IA[]):             "); System.out.println( t.f((IA[])null));
    System.out.print("f(IA[][]):           "); System.out.println( t.f((IA[][])null));
    System.out.print("f(IA[][][]):         "); System.out.println( t.f((IA[][][])null));
    System.out.print("f(IB):               "); System.out.println( t.f((IB)null));
    System.out.print("f(IB[]):             "); System.out.println( t.f((IB[])null));
    System.out.print("f(IB[][]):           "); System.out.println( t.f((IB[][])null));
    System.out.print("f(IB[][][]):         "); System.out.println( t.f((IB[][][])null));
    System.out.print("f(IC):               "); System.out.println( t.f((IC)null));
    System.out.print("f(IC[]):             "); System.out.println( t.f((IC[])null));
    System.out.print("f(IC[][]):           "); System.out.println( t.f((IC[][])null));
    System.out.print("f(A):                "); System.out.println( t.f((A)null));
    System.out.print("f(A[][]):            "); System.out.println( t.f((A[][])null));
    System.out.print("f(A[][][]):          "); System.out.println( t.f((A[][][])null));
    System.out.print("f(String):           "); System.out.println( t.f((String)null));
    System.out.print("f(String[]):         "); System.out.println( t.f((String[])null));
    System.out.print("f(RuntimeException): "); System.out.println( t.f((RuntimeException)null));
    System.out.print("f(int[]):            "); System.out.println( t.f((int[])null));
    System.out.print("f(IOther):           "); System.out.println( t.f((IOther)null));
    System.out.print("f(IOther[][]):       "); System.out.println( t.f((IOther[][])null));

    System.out.println("Done!");
  }
}

interface IA {}
interface IB extends IA {}
interface IC extends IB {}
class A implements IA {}
interface IOther {}

class Tester {
  String f(Object a)       {return "f(Object)";}
  String f(IA a)           {return "f(IA)";}
  String f(IA[] a)         {return "f(IA[])";}
  String f(IA[][] a)       {return "f(IA[][])";}
  String f(IC[] a)         {return "f(IC[])";}
  String f(long a)         {return "f(long)";}
  String f(boolean a)      {return "f(boolean)";}
}

