// Testing continue inside try/finally inside for. Finally block should execute
// after continue was executed

public class continue_07_finally_for {

  public static void main(String[] args) {
    int i;
    for(i=0; i<10; i++) {
      try {
        if (i % 2 != 0) continue;
        System.out.print(i); System.out.print("-");
      } finally {
        System.out.print(i); System.out.print( " ");
      }
    }
    System.out.println();
    System.out.print("final i = "); System.out.println( i);
    System.out.println("Done!");
  }
}

// 0-0 1 2-2 3 4-4 5 6-6 7 8-8 9
// final i = 10
// Done!
