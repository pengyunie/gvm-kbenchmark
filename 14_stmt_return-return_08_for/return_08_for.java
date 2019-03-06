//return in for

public class return_08_for {

  public static void main(String[] args) {
    new test();
    System.out.println("Done!");
  }
}

class test {
  test() {
    System.out.print("isPrime(10) = "); System.out.println( isPrime(10));
    System.out.print("isPrime(9) = "); System.out.println( isPrime(9));
    System.out.print("isPrime(7) = "); System.out.println( isPrime(7));
  }

  //JBook semantics don't support operator String + boolean, that's why we need String here
  String isPrime(int n) {
    for(int i=2; i<n; i++) {
      if (n % i == 0) {
        return "false";
      }
    }
    return "true";
  }
}
