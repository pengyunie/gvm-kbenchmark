/*
Classes S, O, O.A < S. Access members of S, O, A from A.
*/

public class inner_in_301_inner_is_derived {
  public static void main(String[] args) {
    new O().new A().test();
    System.out.println("Done!");
  }
}

class S {
    int sv = 1;
    String sf() {return "sf()";}
}

class O {

    int ov = 2;
    String of() {return "of()";}

  class A extends S {
    int av = 20;
    String af() {return "af()";}

    void test() {
      System.out.print("O.A: av   = "); System.out.println( av);
      System.out.print("O.A: af() = "); System.out.println( af());
      System.out.print("O.A: ov   = "); System.out.println( ov);
      System.out.print("O.A: of() = "); System.out.println( of());
      System.out.print("O.A: sv   = "); System.out.println( sv);
      System.out.print("O.A: sf() = "); System.out.println( sf());
    }
  }
}
