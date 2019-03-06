/*
Unary numeric promotion:
  short in +/-/~
  short_short in >>, <<, >>>
  long_short in >>, <<, >>>
  short_long in >>, <<, >>>
  Result fitting in promoted type only, where possible.
*/
public class imp_conv_05_unary_num_prom {
  public static void main(String[] args) {
      System.out.print(""); System.out.print((+(short)1000)); System.out.print(" "); System.out.print((-(short)(-32768)));
      System.out.print(" "); System.out.println(((short)(-32768)));
      System.out.print("");
      System.out.print(((short)10000 >> (short)2)); System.out.print(" ");
      System.out.print(((short)10000 << (short)2)); System.out.print(" ");
      System.out.println(((short)-10000 >>> (short)2) );
      System.out.print("");
      System.out.print((10000L >> (short)2)); System.out.print(" ");
      System.out.print((10000L << (short)24)); System.out.print(" ");
      System.out.println((-10000L >>> (short)2) );
      System.out.print("");
      System.out.print(((short)10000 >> 2L)); System.out.print(" ");
      System.out.print(((short)10001 << 24L)); System.out.print(" ");
      System.out.println(((short)-10000 >>> 2L) );
      System.out.println("Done!");
  }
}

