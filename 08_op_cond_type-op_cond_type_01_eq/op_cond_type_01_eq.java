/*
Conditional of equal types.
  Pairs:
    - boolean boolean
    - int int
    - A A
    - I I
    - int[] int[]
  Function args: all mentioned pairs + Object.
*/

public class op_cond_type_01_eq {
  public static void main(String[] args) {
    System.out.print("bool  bool : "); System.out.println( f(true ? true : false));
    System.out.print("int   int  : "); System.out.println( f(true ? 13 : 14));
    System.out.print("A     A    : "); System.out.println( f(true ? (A)null : (A)null));
    System.out.print("I     I    : "); System.out.println( f(true ? (I)null : (I)null));
    System.out.print("int[] int[]: "); System.out.println( f(true ? (int[])null : (int[])null));
    System.out.println("Done!");
  }

  static String f(boolean a) {
    return "boolean";
  }

  static String f(int a) {
    return "int";
  }

  static String f(A a) {
    return "A";
  }

  static String f(I a) {
    return "I";
  }

  static String f(int[] a) {
    return "int[]";
  }

  static String f(Object a) {
    return "Object";
  }
}

class A {}
interface I {}

