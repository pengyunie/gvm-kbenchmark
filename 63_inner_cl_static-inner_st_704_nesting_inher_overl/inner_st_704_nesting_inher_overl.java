/*
Overloading with nesting/inheritance mix.
  Classes:
    - SuperA
    - A < SuperA
    - SuperInner
    - A.Inner < SuperInner
  Members:
    - SuperA.f(byte)
    - A.f(short)
    - SuperInner.f(int)
    - Inner.f(long)
  Call f(long), f(int), f(short), f(byte) from Inner.
*/

public class inner_st_704_nesting_inher_overl {

  public static void main(String[] args) {
    A.Inner.test();

    System.out.println("Done!");
  }
}

class SuperA {
  static String f(byte a) {
    return "SuperA.f(byte)";
  }
}

class SuperInner {
  static String f(int a) {
    return "SuperInner.f(int)";
  }
}

class A extends SuperA {

  static String f(short a) {
    return "A.f(short)";
  }

  public static class Inner extends SuperInner {

    static String f(long a) {
      return "A.Inner.f(long)";
    }

    static void test() {
      System.out.print("byte arg: "); System.out.println( f((byte)0));
      System.out.print("short arg:"); System.out.println( f((short)0));
      System.out.print("int arg:  "); System.out.println( f((int)0));
      System.out.print("long arg: "); System.out.println( f((long)0));
    }
  }
}
