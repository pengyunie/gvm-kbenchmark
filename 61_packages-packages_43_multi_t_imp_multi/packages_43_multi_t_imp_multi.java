/*
Multiple type imports on demand.
  Classes Main, pt.Test, pa1.A, pa2.A, pb1.B, pb1.C, pb2.B, pb2.C From Main import
  pa1.* and pb2.*. From pt.Test import pa2.* and pb1.*.
  Test the simple name "A", "B" and "C" from the classes Main and pt.Test. Also "C" from pt.Test.
*/

import pa1.*;
import pb2.*;
import pt.Test;

public class packages_43_multi_t_imp_multi {
  public static void main(String[] args) {
    System.out.print("main   : A = "); System.out.println( new A());
    System.out.print("main   : B = "); System.out.println( new B());
    System.out.print("main   : C = "); System.out.println( new C());
    Test test = new Test();
    System.out.print("pt.Test: A = "); System.out.println( test.createA());
    System.out.print("pt.Test: B = "); System.out.println( test.createB());
    System.out.print("pt.Test: C = "); System.out.println( test.createC());
    System.out.println("Done!");
  }
}
