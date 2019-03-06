/*
Type import on demand, nested packages.
  Classes Main, pt.Test, p1.A, p1.B, p.p1.A, p.p1.B, Import p.p1.* from Main and p1.* from pt.Test.
  Test the simple names A and B from the classes Main and pt.Test.
*/

import p.p1.*;

public class packages_47_multi_t_imp_nested_p {
  public static void main(String[] args) {
    System.out.print("main   : A = "); System.out.println( new A());
    System.out.print("main   : B = "); System.out.println( new B());
    pt.Test test = new pt.Test();
    System.out.print("pt.Test: A = "); System.out.println( test.createA());
    System.out.print("pt.Test: B = "); System.out.println( test.createB());
    System.out.println("Done!");
  }
}
