package pack2;

public class Test {
  public void test() {
    System.out.println("From pack2.Test:");
    System.out.print("Object: "); System.out.println(new Object().getClass().getName());
    System.out.print("RuntimeException: "); System.out.println(new RuntimeException().getClass().getName());
    System.out.print("java.lang.Object: "); System.out.println(new java.lang.Object().getClass().getName());
    System.out.print("java.lang.RuntimeException: "); System.out.println( new java.lang.RuntimeException().getClass().getName());
    System.out.print("pack.Object: "); System.out.println(new pack.Object().getClass().getName());
    System.out.print("pack.RuntimeException: "); System.out.println(new pack.RuntimeException().getClass().getName());
  }
}
