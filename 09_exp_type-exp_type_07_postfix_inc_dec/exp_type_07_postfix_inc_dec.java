/*
Postfix  ++ / --
int b = 1; long a = 10;
b++ : a++
b-- : a--
Print the values after each operator.
*/

public class exp_type_07_postfix_inc_dec {
  public static void main(String[] args) {
    int b = 1; long a = 10;

    System.out.print("f(true  ? b++ : a++): "); System.out.println( f(true  ? b++ : a++));
    System.out.print("(b a) = ("); System.out.print(b ); System.out.print(" "); System.out.print(a ); System.out.println( ")");
    System.out.print("f(false ? b++ : a++): "); System.out.println( f(false ? b++ : a++));
    System.out.print("(b a) = ("); System.out.print(b ); System.out.print(" "); System.out.print(a ); System.out.println( ")");

    System.out.print("f(true  ? b-- : a--): "); System.out.println( f(true  ? b-- : a--));
    System.out.print("(b a) = ("); System.out.print(b ); System.out.print(" "); System.out.print(a ); System.out.println( ")");

    System.out.print("f(false ? b-- : a--): "); System.out.println( f(false ? b-- : a--));
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
