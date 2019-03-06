/*
Classes S, O < S, O.A. Access members of S from A.
*/

public class inner_in_21_acc_outer_base {
  public static void main(String[] args) {
    new O().new A().test();
    System.out.println("Done!");
  }
}

class S {
    int v = 1;
    String f() {return "f()";}
}

class O extends S {

  class A {
    void test() {
      System.out.print("O.A: v   = "); System.out.println( v);
      System.out.print("O.A: f() = "); System.out.println( f());
    }
  }
}
