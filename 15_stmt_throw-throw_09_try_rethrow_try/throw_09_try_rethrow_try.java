public class throw_09_try_rethrow_try {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new RuntimeException();
        System.out.println("unreachable");
      } catch(RuntimeException e) {
        System.out.print("rethrowing: "); System.out.println( e.toString());
        throw e;
      }
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.print("caught again: "); System.out.println( e.toString());
    }
    System.out.println("Done!");
  }
}
