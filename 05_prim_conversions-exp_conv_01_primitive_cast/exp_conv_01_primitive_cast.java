public class exp_conv_01_primitive_cast {
  public static void main(String[] args) {
    System.out.print(""); System.out.print((byte)(byte)100 ); System.out.print(" "); System.out.print((byte)(short)1000 ); System.out.print(" "); System.out.print((byte)(int)1000000 ); System.out.print(" "); System.out.print((byte)(long)9000000000L ); System.out.print(" "); System.out.println( (byte)(char)50000);
    System.out.print(""); System.out.print((short)(byte)100 ); System.out.print(" "); System.out.print((short)(short)1000 ); System.out.print(" "); System.out.print((short)(int)1000000 ); System.out.print(" "); System.out.print((short)(long)9000000000L ); System.out.print(" "); System.out.println( (short)(char)50000);
    System.out.print(""); System.out.print((int)(byte)100 ); System.out.print(" "); System.out.print((int)(short)1000 ); System.out.print(" "); System.out.print((int)(int)1000000 ); System.out.print(" "); System.out.print((int)(long)9000000000L ); System.out.print(" "); System.out.println( (int)(char)50000);
    System.out.print(""); System.out.print((long)(byte)100 ); System.out.print(" "); System.out.print((long)(short)1000 ); System.out.print(" "); System.out.print((long)(int)1000000 ); System.out.print(" "); System.out.print((long)(long)9000000000L ); System.out.print(" "); System.out.println( (long)(char)50000);
    System.out.print(""); System.out.print((int)(char)(byte)100 ); System.out.print(" "); System.out.print((int)(char)(short)1000 ); System.out.print(" "); System.out.print((int)(char)(int)1000000 ); System.out.print(" "); System.out.print((int)(char)(long)9000000000L ); System.out.print(" "); System.out.println( (int)(char)(char)50000);
    System.out.println("Done!");
  }
}
