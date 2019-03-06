/*
Method invocation - widening primitive conv:
  byte to byte, short, int, long
  short to short, int, long
  int int, long
  long to long
  char to int, long, char
*/
public class imp_conv_04_mcall_widening {
  public static void main(String[] args) {
    new Impl();
  }
}

class Impl {
  Impl() {
    byte sb;
    short ss;
    int si;
    long sl;
    char sc;
    sb = (byte)100;
    ss = (short)-1100;
    si = (int)1100200;
    sl = (long)9876543210L;
    sc = (char)'z';

    //byte to others
    System.out.print(""); System.out.print(fb(sb)); System.out.print(" "); System.out.print(fs(sb)); System.out.print(" "); System.out.print(fi(sb)); System.out.print(" "); System.out.println(fl(sb));

    //short to others
    System.out.print(""); System.out.print(fs(ss)); System.out.print(" "); System.out.print(fi(ss)); System.out.print(" "); System.out.println(fl(ss));

    //int to others
    System.out.print(""); System.out.print(fi(si)); System.out.print(" "); System.out.println(fl(si));

    //long to others
    System.out.print(""); System.out.println(fl(sl));

    //char to others
    System.out.print(""); System.out.print(fi(sc)); System.out.print(" "); System.out.print(fl(sc)); System.out.print(" "); System.out.println(fc(sc));

    System.out.println("Done!");
  }

  byte fb(byte param) {
    return param;
  }
  short fs(short param) {
    return param;
  }
  int fi(int param) {
    return param;
  }
  long fl(long param) {
    return param;
  }
  int fc(char param) {
    return (int)param;
  }
}
