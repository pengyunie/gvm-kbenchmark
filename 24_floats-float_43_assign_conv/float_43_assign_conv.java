/*
Assignment conversion:
  - int assigned to float
  - int assigned to double

Test structure: an overloaded method with one argument of all possible numeric types, both integer and floating-point.
  The method prints the received argument.
  We'll call the method with an argument expression of type x+y, where one of x or y
  is float or double.
*/

public class float_43_assign_conv {
  public static void main(String[] args) {
    float f;
    System.out.print("f(float  f = 100) : ");
    f(f = 100);
    double d;
    System.out.print("f(double d = 100) : ");
    f(d = 100);
    System.out.println("Done!");
  }

  static void f(byte a) {
    System.out.print("byte   a = "); System.out.println( a);
  }

  static void f(short a) {
    System.out.print("short  a = "); System.out.println( a);
  }

  static void f(int a) {
    System.out.print("int    a = "); System.out.println( a);
  }

  static void f(long a) {
    System.out.print("long   a = "); System.out.println( a);
  }

  static void f(char a) {
    System.out.print("char   a = "); System.out.println( a);
  }

  static void f(float a) {
    System.out.print("float  a = "); System.out.println( a);
  }

  static void f(double a) {
    System.out.print("double a = "); System.out.println( a);
  }
}
