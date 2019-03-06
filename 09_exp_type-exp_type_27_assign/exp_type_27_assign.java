/*
Assignment operator simple
int b = 1; long a = 10;
b = 2 : a = 20
Print a, b after assign.
*/

public class exp_type_27_assign {
  public static void main(String[] args) {
    int b = 1; long a = 10;

    System.out.print("f(true  ? (b = 2) : (a = 20)): "); System.out.println( f(true  ? (b = 2) : (a = 20)));
    System.out.print("(b a) = ("); System.out.print(b ); System.out.print(" "); System.out.print(a ); System.out.println( ")");
    System.out.print("f(false ? (b = 2) : (a = 20)): "); System.out.println( f(false ? (b = 2) : (a = 20)));
    System.out.print("(b a) = ("); System.out.print(b ); System.out.print(" "); System.out.print(a ); System.out.println( ")");

    System.out.println("Done!");
  }

  static String f(int b) {
    return "f(int): " + b;
  }

  static String f(long a) {
    return "f(long): " + a;
  }
}
