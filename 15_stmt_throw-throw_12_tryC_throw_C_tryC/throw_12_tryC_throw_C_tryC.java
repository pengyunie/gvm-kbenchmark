class ExA extends RuntimeException {
  ExA() {
  }
}

public class throw_12_tryC_throw_C_tryC {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new ExA();
        System.out.println("unreachable");
      } catch(ExA e) {
        System.out.println("caught ExA: " + e.toString());
        throw new RuntimeException();
      } catch(RuntimeException e) {
        System.out.println("caught re: " + e.toString());
      }
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.println("caught re 2: " + e.toString());
    }
    System.out.println("Done!");
  }
}
