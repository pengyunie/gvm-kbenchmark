/*
Assignment don't happen when ArrayStoreException is thrown.
*/

public class array_30_ASException_no_assign {
  public static void main(String[] args) {
    Object[] vo = new RuntimeException[1];
    vo[0] = null;
    System.out.print("before exception: "); System.out.println( vo[0]);
    try {
      vo[0] = new Object();
      System.out.print("ok: "); System.out.println( vo[0]);
    } catch (ArrayStoreException e) {
      System.out.println(e);
      System.out.print("after exception: "); System.out.println( vo[0]);
    }
    System.out.println("Done!");
  }
}
