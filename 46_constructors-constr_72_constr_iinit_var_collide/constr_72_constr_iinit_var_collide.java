/*
Testing the distinction between IInit and freshEnv(IInit) in the rule [invokeConstructor].
  Constructor with argument a="Constr.a", instance initializer with local var a = "IInit.a".
  Print a in the constructor.
*/

class A {

  {
    String a = "IInit.a";
    System.out.print("A.IInit("); System.out.print(a ); System.out.println( ")");
  }

  A(String a) {
    System.out.print("A.A("); System.out.print(a ); System.out.println( ")");
  }
}

public class constr_72_constr_iinit_var_collide {
  public static void main(String[] args) {
    new A("Constr.a");
    System.out.println("Done!");
  }
}
