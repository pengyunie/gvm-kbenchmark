/*
O, O.A. Instantiate inner class from main, using a qualified constructor call.
  Inner class method test() calls both its members and instance members of the enclosing class.
*/

public class inner_in_16_qual_constr {
  public static void main(String[] args) {
    O o = new O(1);
    o.new A(1).test();
    o.new A(2).test();
    System.out.println("Done!");
  }
}

class O {

  int v;

  String f() {
    return "O[v=" + v + "].f()";
  }

  O(int id) {
    v = id;
  }

  class A {
    int va;

    String fa() {
      return "A[va=" + va + "].fa()";
    }

    A(int id) {
      va = id;
    }

    void test() {
      System.out.print("O.A: va   = "); System.out.println( va);
      System.out.print("O.A: fa() = "); System.out.println( fa());
      System.out.print("O.A: v    = "); System.out.println( v);
      System.out.print("O.A: f()  = "); System.out.println( f());
    }
  }
}
