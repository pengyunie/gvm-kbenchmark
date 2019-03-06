/*
Local class, inside instance method, inside another inner class,
  inside a top-level class. Class members:
  - O: af(), av, bf(), bv, cf(), cv.
  - Mid: af(), av, bf(), bv, test()
  - ILB: af(), av, test().
  All members are non-static.
  Access them by simple name from ILB.test(). Also discriminate using this, O.this, Mid.this, ILB.this.
  See $8.1.3 for the precise semantics of inner classes.
*/

public class local_cl_56_three_lvl_hiding_inner {
  public static void main(String[] args) {
    new O().new Mid().test();
    System.out.println("Done!");
  }
}

class O {

  String av = "O.av";

  String af() {return "O.af()";}

  String bv = "O.bv";

  String bf() {return "O.bf()";}

  String cv = "O.cv";

  String cf() {return "O.cf()";}

  class Mid {

    String av = "Mid.av";

    String af() {return "Mid.af()";}

    String bv = "Mid.bv";

    String bf() {return "Mid.bf()";}

    void test() {
      class ILB {

        String av = "ILB.av";

        String af() {return "ILB.af()";}

        void test() {
          System.out.print("O.Mid.test().ILB.test()[\n"); System.out.print("av="); System.out.print(av); System.out.print(", af() = "); System.out.print(af() ); System.out.print(",\n"); System.out.print("bv="); System.out.print(bv); System.out.print(", bf() = "); System.out.print(bf() ); System.out.print(",\n"); System.out.print("cv="); System.out.print(cv); System.out.print(", cf() = "); System.out.print(cf() ); System.out.print(",\n"); System.out.print("this.av = "); System.out.print(this.av ); System.out.print(", this.af() = "); System.out.print(this.af() ); System.out.print(",\n"); System.out.print("ILB.this.av = "); System.out.print(ILB.this.av ); System.out.print(", ILB.this.af() = "); System.out.print(ILB.this.af() ); System.out.print(",\n"); System.out.print("Mid.this.av = "); System.out.print(Mid.this.av ); System.out.print(", Mid.this.af() = "); System.out.print(Mid.this.af() ); System.out.print(",\n"); System.out.print("O.this.av = "); System.out.print(O.this.av ); System.out.print(", O.this.af() = "); System.out.print(O.this.af() ); System.out.print("\n"); System.out.println("]");
        }
      }

      new ILB().test();
    }
  }
}
