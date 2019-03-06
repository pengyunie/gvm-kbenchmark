/*
Type import on demand.
  Classes Main, pt.Test, p1.A, p1.B, p2.A, p2.B Import p1.* from Main and p2.* from pt.Test.
  Test the simple names A and B from the classes Main and pt.Test.
*/

import p1.*;
import pt.Test;

public class packages_42_multi_t_imp_typical {
  public static void main(String[] args) {
    System.out.print("main   : A = "); System.out.println( new A());
    System.out.print("main   : B = "); System.out.println( new B());
    Test test = new Test();
    System.out.print("pt.Test: A = "); System.out.println( test.createA());
    System.out.print("pt.Test: B = "); System.out.println( test.createB());
    System.out.println("Done!");
  }
}
