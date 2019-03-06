/*
Cast to types: double to byte, short, int, long, char, float, double.
*/

public class float_33_double_to_types {
  public static void main(String[] args) {
    double f1 = 1234567.1;
    System.out.print("         f1  = "); System.out.println(          f1);
    System.out.print("(byte)   f1  = "); System.out.println( (byte)   f1);
    System.out.print("(short)  f1  = "); System.out.println( (short)  f1);
    System.out.print("(int)    f1  = "); System.out.println( (int)    f1);
    System.out.print("(long)   f1  = "); System.out.println( (long)   f1);
    System.out.print("(char)   f1  = "); System.out.println( (char)   (float)90);
    System.out.print("(float)  f1  = "); System.out.println( (float)  f1);
    System.out.print("(double) f1  = "); System.out.println( (double) f1);
    System.out.println("Done!");
  }
}
