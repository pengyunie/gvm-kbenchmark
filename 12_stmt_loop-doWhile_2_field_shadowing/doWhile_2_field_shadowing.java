// In this test doWhile body declares a variable
// with the same name as the field. After doWhile completes,
// we should be able to access the field again.

class main {
  int i = 1;

	main(String[] args) {
    do {
      int i = 10;
    } while (false);
    System.out.print("After doWhile i = "); System.out.println( i);
    System.out.println("Done!");
  }
}

public class doWhile_2_field_shadowing {
  public static void main(String[] args) {
    new main(args);
  }
}

// After doWhile i = 1
// Done!
