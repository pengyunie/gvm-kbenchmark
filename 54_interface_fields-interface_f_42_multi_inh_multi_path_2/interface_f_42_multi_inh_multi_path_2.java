/*
Multiple-inherited field.
  B < (A, I2) < I1{v}
  We will test unqualified and I4-qualified exp.
*/

public class interface_f_42_multi_inh_multi_path_2 {
  public static void main(String[] args) {
    System.out.print(B.v ); System.out.print(" "); System.out.println( new B().getV());
    System.out.println("Done!");
  }
}

interface I1 {
  int v = 1;
}

interface I2 extends I1 {}
class A implements I1 {}

class B extends A implements I2 {
  int getV() {
    return v;
  }
}
