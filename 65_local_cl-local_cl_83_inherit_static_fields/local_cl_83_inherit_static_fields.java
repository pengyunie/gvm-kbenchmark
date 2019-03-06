/*
Local class derived from another class with static fields. Call the fields qualified with
  the local class name.
*/

public class local_cl_83_inherit_static_fields {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class Statics {
  static String sv = "Statics.sv";
}

class O {

  void test() {

    class LA extends Statics {}

    LA la = new LA();
    System.out.print("LA.sv = "); System.out.println( LA.sv);
    System.out.print("la.sv = "); System.out.println( la.sv);
  }
}
