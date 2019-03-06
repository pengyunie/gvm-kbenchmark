/*
Cast types to double: byte, short, int, long, char, float, double to float, without precision loss.
*/

public class float_34_types_to_double {
  public static void main(String[] args) {
    System.out.print("(double) (byte) 100  = "); System.out.println( (double) (byte) 100);
    System.out.print("(double) (short)100  = "); System.out.println( (double) (short)100);
    System.out.print("(double)        100  = "); System.out.println( (double)        100);
    System.out.print("(double)       100L  = "); System.out.println( (double)       100L);
    System.out.print("(double)        'c'  = "); System.out.println( (double)        'c');
    System.out.print("(double)       1.23  = "); System.out.println( (double)       1.23);
    System.out.print("(double)      1.23d  = "); System.out.println( (double)      1.23d);
    System.out.println("Done!");
  }
}
