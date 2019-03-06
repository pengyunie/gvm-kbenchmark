/*
  Performs call: ((A)C).f, ((B)C).f, ((C)C).f , from package b
*/
package b;

import a.*;

public class Test_in_b {

  public Test_in_b() {
    System.out.print("Call: ((A)C).f, ((B)C).f, ((C)C).f , from "); System.out.print(getClass().getName()); System.out.println(":");

    C c = new C();
    ((A)c).f((short)0);
    ((B)c).f((short)0);
    ((C)c).f((short)0);

    System.out.println();
  }
}
