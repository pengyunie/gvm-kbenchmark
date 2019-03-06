//Escape sequences for chars - named, octal and unicode.
//Only chars in the range of ascii codes 0-127.
//Those beyond 127 are not supported by maude.
public class literals_06_char_escape {
	public static void main(String[] args) {
    System.out.println("Named escape:");
    System.out.print(""); System.out.print('\b'); System.out.print('\t'); System.out.print('\n'); System.out.print('\f'); System.out.print('\r'); System.out.print('\"'); System.out.println('\''+'\\');
    System.out.println("Octal escape of simple chars:");
    System.out.print(""); System.out.print('\141'); System.out.print('\101'); System.out.print('\60'); System.out.print('\40'); System.out.println('\43');//aA0 #
    System.out.println("Unicode escape of simple chars:");
    System.out.print(""); System.out.print('\u0061'); System.out.print('\u0041'); System.out.print('\u0030'); System.out.print('\u0020'); System.out.println('\u0023');//aA0 #

    System.out.println("Octal escape:");
    System.out.print(""); System.out.print('\0'); System.out.print('\7'); System.out.print('\00'); System.out.print('\07'); System.out.print('\37'); System.out.print('\77'); System.out.print('\000'); System.out.print('\007'); System.out.print('\077'); System.out.println('\177');
    System.out.print("Octal escape 0, 127, again: "); System.out.print('\0'); System.out.println( '\177');
    System.out.println("Unicode escape:");
    System.out.print(""); System.out.print('\u0000'); System.out.print('\u0001'); System.out.print('\uu0007'); System.out.print('\u0010'); System.out.println('\uuu007f');
		System.out.println("Done!");
	}
}
