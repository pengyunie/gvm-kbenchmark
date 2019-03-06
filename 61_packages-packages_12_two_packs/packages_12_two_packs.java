/*
Two simple packages pack1 and pack2. One class inside each, with different names. Refer both
  through fully-qualified class name.
*/

public class packages_12_two_packs {
  public static void main(String[] args) {
    System.out.print(new pack1.A() ); System.out.print(" "); System.out.println( new pack2.B());
    System.out.println("Done!");
  }
}
