public class op_112_lazy_and {
  public static void main(String[] args) {
    new main(args);
  }
}

class main {

	main(String[] args) {
    System.out.print("false && true       = "); System.out.println( (false&&true));
    System.out.print("true && false       = "); System.out.println( (true&&false));
    System.out.print("fFalse() && fTrue() = "); System.out.println( (fFalse()&&fTrue()));
    System.out.print("fTrue() && fFalse() = "); System.out.println( (fTrue()&&fFalse()));
    System.out.println("Done!");
	}

  boolean fTrue() {
    System.out.println("fTrue()");
    return true;
  }

  boolean fFalse() {
    System.out.println("fFalse()");
    return false;
  }
}
