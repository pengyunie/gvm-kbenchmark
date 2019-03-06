/*
Conditional of numeric types.
  Pairs: all 5*5 pairs of integer numeric types.
  Function args: all numeric types
*/

public class op_cond_type_02_numeric {
  public static void main(String[] args) {
    byte b = 0;
    short s = 0;
    int i = 0;
    long l = 0;
    char c = 0;

    System.out.print("byte  byte  : "); System.out.println( f(true ? b : b));
    System.out.print("byte  short : "); System.out.println( f(true ? b : s));
    System.out.print("byte  int   : "); System.out.println( f(true ? b : i));
    System.out.print("byte  long  : "); System.out.println( f(true ? b : l));
    System.out.print("byte  char  : "); System.out.println( f(true ? b : c));
    System.out.println();

    System.out.print("short byte  : "); System.out.println( f(true ? s : b));
    System.out.print("short short : "); System.out.println( f(true ? s : s));
    System.out.print("short int   : "); System.out.println( f(true ? s : i));
    System.out.print("short long  : "); System.out.println( f(true ? s : l));
    System.out.print("short char  : "); System.out.println( f(true ? s : c));
    System.out.println();

    System.out.print("int   byte  : "); System.out.println( f(true ? i : b));
    System.out.print("int   short : "); System.out.println( f(true ? i : s));
    System.out.print("int   int   : "); System.out.println( f(true ? i : i));
    System.out.print("int   long  : "); System.out.println( f(true ? i : l));
    System.out.print("int   char  : "); System.out.println( f(true ? i : c));
    System.out.println();

    System.out.print("long  byte  : "); System.out.println( f(true ? l : b));
    System.out.print("long  short : "); System.out.println( f(true ? l : s));
    System.out.print("long  int   : "); System.out.println( f(true ? l : i));
    System.out.print("long  long  : "); System.out.println( f(true ? l : l));
    System.out.print("long  char  : "); System.out.println( f(true ? l : c));
    System.out.println();

    System.out.print("char  byte  : "); System.out.println( f(true ? c : b));
    System.out.print("char  short : "); System.out.println( f(true ? c : s));
    System.out.print("char  int   : "); System.out.println( f(true ? c : i));
    System.out.print("char  long  : "); System.out.println( f(true ? c : l));
    System.out.print("char  char  : "); System.out.println( f(true ? c : c));
    System.out.println();

    System.out.println("Done!");
  }

  static String f(byte a) {
    return "byte";
  }

  static String f(short a) {
    return "short";
  }

  static String f(int a) {
    return "int";
  }

  static String f(long a) {
    return "long";
  }

  static String f(char a) {
    return "char";
  }
}
