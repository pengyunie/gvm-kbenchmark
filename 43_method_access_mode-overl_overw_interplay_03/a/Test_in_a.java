/*
  Performs call: ((A)C).f, ((B)C).f, ((C)C).f , from package a
*/
package a;

import b.*;

public class Test_in_a {

  public Test_in_a() {
    System.out.print("Call: ((A)C).f, ((B)C).f, ((C)C).f , from "); System.out.print(getClass().getName()); System.out.println(":");

    C c = new C();
    ((A)c).f(0);
    ((B)c).f(0);
    ((C)c).f(0);

    System.out.println();
  }
}
