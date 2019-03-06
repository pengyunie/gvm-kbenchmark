//decimal integer literals
public class literals_011_long_decimal {
	public static void main(String[] args) {
    System.out.println("Decimal long literals:");
		System.out.print(0L ); System.out.print(" "); System.out.print(12L ); System.out.print(" "); System.out.print(12345678900l ); System.out.print(" "); System.out.println( 12345678900L);
    System.out.print("Long not overflow, 2002001001L + 2002001001L = ");
    System.out.println((2002001001L + 2002001001L));
    System.out.print("long extremes: "); System.out.print(-9223372036854775808L ); System.out.print(" "); System.out.println( 9223372036854775807L);
		System.out.println("Done!");
	}
}

