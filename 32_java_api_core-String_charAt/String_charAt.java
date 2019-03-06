/*Testing String.charAt(), just the normal case, and String.length().
  Also adding the resulting char with an int.
*/

public class String_charAt {

  public static void main(String[] args) {
    String s = "abc";
    for(int i=0; i<s.length(); i++) {
      System.out.print("s.charAt("); System.out.print(i); System.out.print(")= "); System.out.println( s.charAt(i));
    }
    char nextOfA = ((char)(s.charAt(0) + 1));
    System.out.print("next of a = "); System.out.println( nextOfA);
    System.out.println("Done!");
  }
}
