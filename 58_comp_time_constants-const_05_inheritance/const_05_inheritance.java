/*
Constants are inherited from the base class.
  Class B < A.
  A: constant x, static init
  B: static init
  Main: access B.x.
*/

class const_05_inheritance {
  public static void main(String[] argv) {
    System.out.print("Constant: "); System.out.println( B.x);
    System.out.println("Done!");
  }
}

class A {
  static final int x = 7;
  static {
    System.out.println("Initialization of A");
  }
}

class B extends A {
  static {
    System.out.println("Initialization of B");
  }
}
