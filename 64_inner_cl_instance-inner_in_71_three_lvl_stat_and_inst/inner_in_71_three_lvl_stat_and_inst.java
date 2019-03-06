/*
71. Top-level class O, static inner O.Mid, instance inner O.Mid.Inner.
  From Inner call by simple name:
  - inner field,
  - inner method
  - Mid instance field
  - Mid instance method
  - Mid static field
  - Mid static method
  - O static field
  - O static method
  Instantiate the class Inner from O: new Mid().new Inner()
*/

public class inner_in_71_three_lvl_stat_and_inst {
  public static void main(String[] args) {
    new O().newInner().test();
    System.out.println("Done!");
  }
}

class O {

  static String ov = "O.ov";
  static String of() {return "O.of()";}

  Mid.Inner newInner() {
    return new Mid().new Inner();
  }

  static class Mid {

    static String smidv = "Mid.smidv";
    static String smidf() {return "Mid.smidf()";}

    String midv = "Mid.midv";
    String midf() {return "Mid.midf()";}

    class Inner {

      String inv = "Inner.inv";
      String inf() {return "Inner.inf()";}

      void test() {
        System.out.print("ov = "); System.out.println( ov);
        System.out.print("of() = "); System.out.println( of());
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
