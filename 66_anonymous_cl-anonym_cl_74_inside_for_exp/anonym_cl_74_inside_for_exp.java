/*
Anonymous class inside for first clause - initializer, the clause is expression.
*/

public class anonym_cl_74_inside_for_exp {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

interface I1 {
  void test();
}

class O {

  void test() {
    I1 i1;
    for(
      i1 = new I1() {

        int v = 1;

        String f() {
          return "anon.f()";
        }

        public void test() {
          System.out.print("anon: v = "); System.out.print(v ); System.out.print(", f() = "); System.out.println( f());
        }
      };
      i1 != null;
      i1 = null
    ) {
      i1.test();
    }
  }
}
