//Hexadecimal integer literals
public class literals_02_integer_hexa {
	public static void main(String[] args) {
    System.out.println("Hexa int literals:");
		System.out.print(0x0 ); System.out.print(" "); System.out.print(0x5f ); System.out.print(" "); System.out.print(0X5F ); System.out.print(" "); System.out.println( 0xFFFFFFF0);
    System.out.print("Hexa int overflow, 0x70000000 + 0x70000000 = ");
                System.out.println((0x70000000 + 0x70000000));
    System.out.print("int extremes: "); System.out.print(0x80000000 ); System.out.print(" "); System.out.println( 0x7fffffff);
    System.out.println("Hexa long literals:");
		System.out.print(0x0L ); System.out.print(" "); System.out.print(0x123456789abL ); System.out.print(" "); System.out.print(0x123456789ABl
        ); System.out.print(" "); System.out.print(0xFFFFFFF0L ); System.out.print(" "); System.out.println( 0xFFFFFFFF00000000L);
    System.out.print("Hexa long not overflow, 0x70000000L + 0x70000000L = ");
                System.out.println((0x70000000L + 0x70000000L));
    System.out.print("long extremes: "); System.out.print(0x8000000000000000L
        ); System.out.print(" "); System.out.println( 0x7fffffffffffffffL);
		System.out.println("Done!");
	}
}

