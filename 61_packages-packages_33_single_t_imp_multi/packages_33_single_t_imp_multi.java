/*
Multiple single-type imports.
  Classes Main, Test, p.pb.A, p.pb.B, p.pb.Test, p.pc.A, p.pc.B.
  From Main import p.pb.A and p.pc.B. From Test import p.pc.A and p.pb.B.
  Test the simple name "A" and "B" from the classes Main, Test and p.pb.Test.
*/

import p.pb.A;
import p.pc.B;

public class packages_33_single_t_imp_multi {
  public static void main(String[] args) {
    System.out.print("main     : A = "); System.out.println( new A());
    System.out.print("main     : B = "); System.out.println( new B());
    System.out.print("Test     : A = "); System.out.println( new Test().createA());
    System.out.print("Test     : B = "); System.out.println( new Test().createB());
    System.out.print("p.pb.Test: A = "); System.out.println( new p.pb.Test().createA());
    System.out.print("p.pb.Test: B = "); System.out.println( new p.pb.Test().createB());
    System.out.println("Done!");
  }
}
