/*
Default value of refs:
  Object[], String[], RuntimeException[], Object[][], int[][].
*/

public class array_43_default_val_ref {

  public static void main(String[] args) {
    Object[] vo = new Object[2];
    System.out.print(vo[0] ); System.out.print(" "); System.out.println( vo[1]);

    String[] vs = new String[2];
    System.out.print(vs[0] ); System.out.print(" "); System.out.println( vs[1]);

    RuntimeException[] vre = new RuntimeException[2];
    System.out.print(vre[0] ); System.out.print(" "); System.out.println( vre[1]);

    Object[][] vvo = new Object[2][];
    System.out.print(vvo[0] ); System.out.print(" "); System.out.println( vvo[1]);

    int[][] vvi = new int[2][];
    System.out.print(vvi[0] ); System.out.print(" "); System.out.println( vvi[1]);

    System.out.println("Done!");
  }
}

