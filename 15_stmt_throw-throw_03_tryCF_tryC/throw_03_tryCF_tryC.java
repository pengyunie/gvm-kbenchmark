class ExA extends RuntimeException {}

class ExB extends RuntimeException {}

public class throw_03_tryCF_tryC {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new ExA();
        System.out.println("unreachable");
      } catch(ExB e) {
        System.out.print("caught ExB: "); System.out.println( e.toString());
      } finally {
        System.out.println("finally");
      }
      System.out.println("unreachable");
    } catch (ExA e) {
      System.out.print("caught ExA: "); System.out.println( e.toString());
    }
    System.out.println("Done!");
  }
}
