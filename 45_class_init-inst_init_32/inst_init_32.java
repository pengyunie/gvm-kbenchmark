/*
Instance initializer, then field initializer, initializing the same field, then constructor.
*/

class A {

  {
    System.out.print("inst init begin, a = "); System.out.println( this.a);
    a = 3;
  }

  int a = 2;

  A() {
    System.out.print("constr begin, a = "); System.out.println( a);
  }
}

public class inst_init_32 {
  public static void main(String[] args) {
    A a = new A();
    System.out.println("Done!");
  }
}
