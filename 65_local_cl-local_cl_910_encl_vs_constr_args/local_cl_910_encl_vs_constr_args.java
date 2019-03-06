/*
Outer local vars are accessible inside the constructor, but are shadowed by constructor args.
*/

public class local_cl_910_encl_vs_constr_args {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class O {

  void test() {

    final int a = 1, b = 10, c = 100;

    class Local {
      Local(int a) {
        System.out.print("O.test().Local: a="); System.out.print(a ); System.out.print(" ,b="); System.out.print(b ); System.out.print(" ,c="); System.out.println(c);
      }
    }

    System.out.print("O.test(): a="); System.out.print(a ); System.out.print(" ,b="); System.out.print(b ); System.out.print(" ,c="); System.out.println(c);
    new Local(2);
  }
}
