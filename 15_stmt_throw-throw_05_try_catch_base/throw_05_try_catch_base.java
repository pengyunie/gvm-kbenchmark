class ExA extends RuntimeException {
  ExA() {
  }
}

public class throw_05_try_catch_base {
  public static void main(String[] args) {
    try {
      if (true) throw new ExA();
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.print("caught: "); System.out.println( e.toString());
    }
    System.out.println("Done!");
  }
}
