public class return_04_ret_sum {

  public static void main(String[] args) {
    new test();
    System.out.println("Done!");
  }
}

class test {
  test() {
    System.out.print("f() = "); System.out.println( f());
  }

  int f() {
    System.out.println("inside f()");
    return 3+4;
  }
}
