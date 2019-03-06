/*
71. Interface I, "implicitly" static inner I.Mid (e.g. without keyword static), instance inner I.Mid.Inner.
  Class A < I.
  From Inner call by simple name:
  - inner field,
  - inner method
  - Mid instance field
  - Mid instance method
  - Mid static field
  - Mid static method
  - I static field
  - I static method
  Instantiate the class Inner from A: new Mid().new Inner()
  Also without A: new I.Mid().new Inner()
*/

public class inner_in_72_three_lvl_interf {
  public static void main(String[] args) {
    System.out.println("new A().newInner().test():");
    new A().newInner().test();
    System.out.println();
    System.out.println("new I.Mid().new Inner().test():");
    new I.Mid().new Inner().test();
    System.out.println("Done!");
  }
}

interface I {

  String iv = "I.iv";

  class Mid {

    static String smidv = "Mid.smidv";
    static String smidf() {return "Mid.smidf()";}

    String midv = "Mid.midv";
    String midf() {return "Mid.midf()";}

    class Inner {

      String inv = "Inner.inv";
      String inf() {return "Inner.inf()";}

      void test() {
        System.out.print("iv = "); System.out.println( iv);
        System.out.print("smidv = "); System.out.println( smidv);
        System.out.print("smidf() = "); System.out.println( smidf());
        System.out.print("midv = "); System.out.println( midv);
        System.out.print("midf() = "); System.out.println( midf());
        System.out.print("inv = "); System.out.println( inv);
        System.out.print("inf() = "); System.out.println( inf());
      }
    }
  }
}

class A implements I {
  Mid.Inner newInner() {
    return new Mid().new Inner();
  }
}
