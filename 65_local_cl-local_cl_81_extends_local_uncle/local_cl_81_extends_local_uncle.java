/*
Class O. Local classes A, Local, in the same block. Inside Local - local class DeepLocal derived from A.
  Instantiate one DeepLocal. Fields inside classes:
  O: a,b
  Local: a,c
  A: a,d
  DeepLocal: a,e
  Print all 8 fields from DeepLocal, using qualified this/super where needed.
*/

public class local_cl_81_extends_local_uncle {
  public static void main(String[] args) {
    new O().test();
    System.out.println("Done!");
  }
}

class O {

  String a = "O.a";
  String b = "O.b";

  void test() {
    class A {
      String a = "A.a";
      String c = "A.c";
    }

    class Local {
      String a = "Local.a";
      String d = "Local.d";

      void test() {
        class DeepLocal extends A {
          String a = "DeepLocal.a";
          String e = "DeepLocal.e";

          void test() {
            System.out.println("Inside DeepLocal:");
            System.out.print("a="); System.out.println( a);
            System.out.print("b="); System.out.println( b);
            System.out.print("c="); System.out.println( c);
            System.out.print("d="); System.out.println( d);
            System.out.print("e="); System.out.println( e);
            System.out.print("this.a="); System.out.println( this.a);
            System.out.print("super.a="); System.out.println( super.a);
            System.out.print("Local.this.a="); System.out.println( Local.this.a);
            System.out.print("O.this.a="); System.out.println( O.this.a);
          }
        }

        new DeepLocal().test();
      }
    }

    new Local().test();
  }
}
