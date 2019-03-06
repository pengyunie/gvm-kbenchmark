/*
Multiple imports on demand and local classes.
  Classes Main, pt.Test, pt.B, pa.A, pb.B, pc.C. Import pa.* and pc.* from pt.Test. Test
  simple names A,B,C in pt.Test.
*/

import pt.Test;

public class packages_45_multi_t_imp_vs_local {
  public static void main(String[] args) {
    Test test = new Test();
    System.out.println("pt.Test : A = " + test.createA());
    System.out.println("pt.Test : B = " + test.createB());
    System.out.println("pt.Test : C = " + test.createC());
    System.out.println("Done!");
  }
}

