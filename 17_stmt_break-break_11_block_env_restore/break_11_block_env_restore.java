//Exception var hiding local vars with the same name

class main {

  int b = 10;

  main() {
    int i = 0;
    while (i < 2) {
      System.out.print("i = "); System.out.println( i);
      i++;
      try {
        int b = 2;
        System.out.print("try: b = "); System.out.println( b);
        break;
      } finally {
        System.out.print("finally: b = "); System.out.println( b);
      }
    }
  }
}

public class break_11_block_env_restore {
  public static void main(String[] args) {
    new main();
    System.out.println("Done!");
  }
}
