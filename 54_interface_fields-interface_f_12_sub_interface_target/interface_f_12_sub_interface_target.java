/*
Access to an interface field. Through a sub-interface.
    Possible expressions: Interface qualifier, interface ref qualifier.
*/

public class interface_f_12_sub_interface_target {
  public static void main(String[] args) {
    System.out.print(I2.v ); System.out.print(" "); System.out.println( ((I2) new A()).v);
    System.out.println("Done!");
  }
}

interface I1 {
  int v = 12;
}

interface I2 extends I1{}

class A implements I2 {
}
