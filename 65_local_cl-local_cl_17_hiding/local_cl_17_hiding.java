/*
17. Local class and hiding.
  - Class O, members: av, af(), bv, bf(), test(),
  - Class O.test().LA, members: av, af(), test().
  From LA.test() call av, af(), bv, bf(), this.av(, this.af(), LA.this.av, LA.this.af(), O.this.av, O.this.af().
*/

public class local_cl_17_hiding {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class O {

  String av = "O.av";

  String af() {return "O.af()";}

  String bv = "O.bv";

  String bf() {return "O.bf()";}

  void test() {

    class LA {

      String av = "LA.av";

      String af() {return "LA.af()";}

      void test() {
        System.out.print("O.LA.test()[\n"); System.out.print("av="); System.out.print(av); System.out.print(", af() = "); System.out.print(af() ); System.out.print(",\n"); System.out.print("bv="); System.out.print(bv); System.out.print(", bf() = "); System.out.print(bf() ); System.out.print(",\n"); System.out.print("this.av = "); System.out.print(this.av ); System.out.print(", this.af() = "); System.out.print(this.af() ); System.out.print(",\n"); System.out.print("LA.this.av = "); System.out.print(LA.this.av ); System.out.print(", LA.this.af() = "); System.out.print(LA.this.af() ); System.out.print(",\n"); System.out.print("O.this.av = "); System.out.print(O.this.av ); System.out.print(", O.this.af() = "); System.out.print(O.this.af() ); System.out.print("\n"); System.out.println("]");
      }
    }

    new LA().test();
  }
}
