/*
Inner classes as part of type declarations.
  - class extends clause
  - class implements clause
  - interface extends clause
*/

import p1.*;

public class inner_st_606_type_decl {

  public static void main(String[] args) {
    System.out.print(C1.id ); System.out.print(" "); System.out.println( C1.iid);
    System.out.print(C2.id ); System.out.print(" "); System.out.println( C2.iid);
    System.out.print(p1.A.C1.id ); System.out.print(" "); System.out.println( p1.A.C1.iid);
    System.out.print(A.C1.id ); System.out.print(" "); System.out.println( A.C1.iid);
    System.out.print(C1.id ); System.out.print(" "); System.out.println( C1.iid);
    System.out.println(I1.iid);
    System.out.println(I2.iid);
    System.out.println(p1.A.I1.iid);
    System.out.println(p1.A.I2.iid);
    System.out.println(p1.A.I3.iid);
    System.out.println("Done!");
  }
}

class C1 extends p1.A.Inner implements p1.A.IInt {}
class C2 extends A.Inner implements A.IInt {}

interface I1 extends p1.A.IInt {}
interface I2 extends A.IInt {}
