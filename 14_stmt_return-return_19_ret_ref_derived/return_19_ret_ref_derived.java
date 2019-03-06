class Ex extends RuntimeException {
  Ex() {
    super();
  }
}

public class return_19_ret_ref_derived {

  public static void main(String[] args) {
    new test();
    System.out.println("Done!");
  }
}

class test {
  test() {
    System.out.print("f() = "); System.out.println( f().toString());
  }

  RuntimeException f() {
    return new Ex();
  }
}
