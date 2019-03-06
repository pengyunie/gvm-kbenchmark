/*
Conditional with two refs, one subtype of another.
  Types: A, I2 < I1. I3 < I2, B < A,
  Pairs:
    - A I1
    - I1 A
    - I2 I1
    - I2[] I1[]
    - A Object
    - I3 I1
    - I1 I3
    - B Object
    - Object B
    - B[] Object[]
  Args:
    - A, B, I1, I2, I3, I1[], I2[], B[], Object[], Object.
*/

public class op_cond_type_05_ref_ref {
  public static void main(String[] args) {
    System.out.print("A      I1       : "); System.out.println( f(true ? (A)null      : (I1)null));
    System.out.print("I1     A        : "); System.out.println( f(true ? (I1)null     : (A)null));
    System.out.print("I2     I1       : "); System.out.println( f(true ? (I2)null     : (I1)null));
    System.out.print("I2[]   I1[]     : "); System.out.println( f(true ? (I2[])null   : (I1[])null));
    System.out.print("A      Object   : "); System.out.println( f(true ? (A)null      : (Object)null));
    System.out.print("I3     I1       : "); System.out.println( f(true ? (I3)null     : (I1)null));
    System.out.print("I1     I3       : "); System.out.println( f(true ? (I1)null     : (I3)null));
    System.out.print("B      Object   : "); System.out.println( f(true ? (B)null      : (Object)null));
    System.out.print("Object B        : "); System.out.println( f(true ? (Object)null : (B)null));
    System.out.print("B[]    Object[] : "); System.out.println( f(true ? (B[])null    : (Object[])null));
    System.out.println("Done!");
  }

  static String f(A a) {
    return "A";
  }

  static String f(B a) {
    return "B";
  }

  static String f(I1 a) {
    return "I1";
  }

  static String f(I2 a) {
    return "I2";
  }

  static String f(I3 a) {
    return "I3";
  }

  static String f(I1[] a) {
    return "I1[]";
  }

  static String f(I2[] a) {
    return "I2[]";
  }

  static String f(B[] a) {
    return "B[]";
  }

  static String f(Object[] a) {
    return "Object[]";
  }

  static String f(Object a) {
    return "Object";
  }
}

interface I1 {}
interface I2 extends I1 {}
interface I3 extends I2 {}
class A implements I1 {}
class B extends A {}
