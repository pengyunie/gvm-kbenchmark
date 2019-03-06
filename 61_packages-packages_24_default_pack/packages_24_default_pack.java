/*
Main and two classes A and B are in the default package. The same classes are in the package pack.
  Test all four of them from Main.
*/

public class packages_24_default_pack {
  public static void main(String[] args) {
    System.out.print(new A() ); System.out.print(" "); System.out.print(new B() ); System.out.print(" "); System.out.print(new pack.A() ); System.out.print(" "); System.out.println( new pack.B());
    System.out.println("Done!");
  }
}
