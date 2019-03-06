/*
Package java.lang have the classes Object and RuntimeException. Add a package pack
  with classes Object and RuntimeException. Test both classes unqualified,
  qualified with "java.lang", and qualified
  with "pack." from Main (default package), and from a class Test inside another package pack2.
*/

public class packages_26_java_lang {
  public static void main(String[] args) {
    new Test().test();
    System.out.println();
    new pack2.Test().test();
    System.out.println("Done!");
  }
}

class Test {
  void test() {
    System.out.println("From Main:");
    System.out.print("Object: "); System.out.println(new Object().getClass().getName());
    System.out.print("RuntimeException: "); System.out.println(new RuntimeException().getClass().getName());
    System.out.print("java.lang.Object: "); System.out.println(new java.lang.Object().getClass().getName());
    System.out.print("java.lang.RuntimeException: "); System.out.println( new java.lang.RuntimeException().getClass().getName());
    System.out.print("pack.Object: "); System.out.println(new pack.Object().getClass().getName());
    System.out.print("pack.RuntimeException: "); System.out.println(new pack.RuntimeException().getClass().getName());
  }
}
