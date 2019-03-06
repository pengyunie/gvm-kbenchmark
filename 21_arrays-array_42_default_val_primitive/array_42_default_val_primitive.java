/*
Default value of primitive types:
  byte[], short[], int[], long[], char[], boolean[].
*/

public class array_42_default_val_primitive {

  public static void main(String[] args) {
    byte[] vb = new byte[2];
    System.out.print(vb[0] ); System.out.print(" "); System.out.println( vb[1]);

    short[] vs = new short[2];
    System.out.print(vs[0] ); System.out.print(" "); System.out.println( vs[1]);

    int[] vi = new int[2];
    System.out.print(vi[0] ); System.out.print(" "); System.out.println( vi[1]);

    long[] vl = new long[2];
    System.out.print(vl[0] ); System.out.print(" "); System.out.println( vl[1]);

    char[] vc = new char[2];
    System.out.print(vc[0] ); System.out.print(" "); System.out.println( vc[1]);

    boolean[] vbool = new boolean[2];
    System.out.print(vbool[0] ); System.out.print(" "); System.out.println( vbool[1]);

    System.out.println("Done!");
  }
}

