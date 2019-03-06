//semantics for this test is covered under chapter $5.
public class imp_conv_03_primitive_var_init {
  public static void main(String[] args) {
    byte bt = 100;
    short sh = 1000;
    int i = 1000000;
    long l = 9000000000L;
    char ch1 = 50000;
    char ch2 = 'z';
    char ch3 = 100;
    System.out.print(""); System.out.print(bt ); System.out.print(" "); System.out.print(sh ); System.out.print(" "); System.out.print(i ); System.out.print(" "); System.out.print(l ); System.out.print(" "); System.out.print((int)ch1 ); System.out.print(" "); System.out.print(ch2 ); System.out.print(" "); System.out.println( ch3);
    System.out.println("Done!");
  }
}
