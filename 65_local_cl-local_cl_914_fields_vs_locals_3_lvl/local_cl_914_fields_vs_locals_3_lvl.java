/*
Own fields should have higher priority than enclosing locals, that have higher
  priority than enclosing fields, that have higher priority than enclosing env
  of the enclosing class. E.g. test 901, but on 3 levels of nesting.
*/

public class local_cl_914_fields_vs_locals_3_lvl {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class O {

  void test() {

    final int a = 1, b = 10, c = 100, d = 1000, e = 10000;

    class Local {
      int a = 2, b=20, c=200, d=2000;

      void test() {
        final int a = 3, b=30, c=300;

        class DeepLocal {
          int a = 4, b=40;

          void test() {
            final int a = 5;

            System.out.print("DeepLocal.test(): a="); System.out.print(a ); System.out.print(" ,b="); System.out.print(b ); System.out.print(" ,c="); System.out.print(c ); System.out.print(" ,d="); System.out.print(d ); System.out.print(" ,e="); System.out.println(e);
          }
        }

        System.out.print("Local.test(): a="); System.out.print(a ); System.out.print(" ,b="); System.out.print(b ); System.out.print(" ,c="); System.out.print(c ); System.out.print(" ,d="); System.out.print(d ); System.out.print(" ,e="); System.out.println(e);

        new DeepLocal().test();
      }
    }

    System.out.print("O.test(): a="); System.out.print(a ); System.out.print(" ,b="); System.out.print(b ); System.out.print(" ,c="); System.out.print(c ); System.out.print(" ,d="); System.out.print(d ); System.out.print(" ,e="); System.out.println(e);

    new Local().test();
  }
}
