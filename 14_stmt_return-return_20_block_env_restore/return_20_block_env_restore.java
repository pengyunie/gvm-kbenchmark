//Exception var hiding local vars with the same name

class main {

  int b = 10;

  main() {
    try {
      int b = 2;
      System.out.print("try: b = "); System.out.println( b);
      return;
    } finally {
      System.out.print("finally: b = "); System.out.println( b);
    }
  }
}

public class return_20_block_env_restore {
  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}

