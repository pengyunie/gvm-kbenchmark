/*
Static base class fields should have higher priority than enclosing locals.
*/

public class local_cl_903_super_stat_fiel_vs_encl {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class A {
  static int a = 5000;
}

class O {

  void test() {

    final int a = 1, b = 20;

    class Local extends A {
      public String toString() {return "O.test().Local: a="+a + " ,b="+b+", this.a="+this.a;}
    }

    System.out.print("O.test(): a="); System.out.print(a ); System.out.print(" ,b="); System.out.println(b);

    System.out.println(new Local());
  }
}
