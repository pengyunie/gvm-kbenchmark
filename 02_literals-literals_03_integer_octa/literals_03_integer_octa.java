//Octal integer literals
public class literals_03_integer_octa {
	public static void main(String[] args) {
    System.out.println("Octa int literals:");
		System.out.print(00 ); System.out.print(" "); System.out.print(077 ); System.out.print(" "); System.out.println( 037777777777);
    System.out.print("Octa int overflow, 017777777777 + 017777777777 = ");
                System.out.println((017777777777 + 017777777777));
    System.out.print("int extremes: "); System.out.print(020000000000 ); System.out.print(" "); System.out.println( 017777777777);
    System.out.println("Octa long literals:");
		System.out.print(00L ); System.out.print(" "); System.out.print(037777777777l
        ); System.out.print(" "); System.out.println( 01777777777777777777777L);
    System.out.print("Octa long not overflow, 017777777777L + 017777777777L = ");
                System.out.println((017777777777L + 017777777777L));
    System.out.print("long extremes: "); System.out.print(01000000000000000000000L
        ); System.out.print(" "); System.out.println( 0777777777777777777777L);
		System.out.println("Done!");
	}
}

