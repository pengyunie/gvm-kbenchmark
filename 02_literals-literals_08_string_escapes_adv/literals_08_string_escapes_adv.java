//Named, octal and unicode escapes, all possible cases, part supported by maude.
public class literals_08_string_escapes_adv {
	public static void main(String[] args) {
    System.out.println("Named escape:");
    System.out.print(""); System.out.print("_\b_"); System.out.print("_\t_"); System.out.print("_\n_"); System.out.print("_\f_"); System.out.print("_\r_"); System.out.println("_\"_"+"_\'_"+"_\\_");
    System.out.println("Octal escape of simple chars:");
    System.out.print(""); System.out.print("_\141_"); System.out.print("_\101_"); System.out.print("_\60_"); System.out.print("_\40_"); System.out.println("_\43_");//aA0 #
    System.out.println("Unicode escape of simple chars:");
    System.out.print(""); System.out.print("_\u0061_"); System.out.print("_\u0041_"); System.out.print("_\u0030_"); System.out.print("_\u0020_"); System.out.println("_\u0023_");//aA0 #

    System.out.println("Octal escape:");
    System.out.print(""); System.out.print("_\0_"); System.out.print("_\7_"); System.out.print("_\00_"); System.out.print("_\07_"); System.out.print("_\37_"); System.out.print("_\77_"); System.out.print("_\000_"); System.out.print("_\007_"); System.out.print("_\077_"); System.out.println("_\177_");
    System.out.println("Unicode escape:");
    System.out.print(""); System.out.print("_\u0000_"); System.out.print("_\u0001_"); System.out.print("_\uu0007_"); System.out.print("_\u0010_"); System.out.println("_\uuu007f_");
		System.out.println("Done!");
	}
}
