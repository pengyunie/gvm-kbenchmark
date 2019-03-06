/*
Comparison operators: <, <=, >, >=, ==, !=.
*/

public class float_23_comparison_ops {
  public static void main(String[] args) {
    double f1 = 1.23, f2 = 1.0;
    System.out.print("1.23 <  1    :"); System.out.println( (f1 <  f2));
    System.out.print("1.23 <  1.23 :"); System.out.println( (f1 <  f1));
    System.out.print("1.23 <= 1    :"); System.out.println( (f1 <= f2));
    System.out.print("1.23 <= 1.23 :"); System.out.println( (f1 <= f1));
    System.out.print("1.23 >  1    :"); System.out.println( (f1 >  f2));
    System.out.print("1.23 >  1.23 :"); System.out.println( (f1 >  f1));
    System.out.print("1.23 >= 1    :"); System.out.println( (f1 >= f2));
    System.out.print("1.23 >= 1.23 :"); System.out.println( (f1 >= f1));
    System.out.print("1.23 == 1    :"); System.out.println( (f1 == f2));
    System.out.print("1.23 == 1.23 :"); System.out.println( (f1 == f1));
    System.out.print("1.23 != 1    :"); System.out.println( (f1 != f2));
    System.out.print("1.23 != 1.23 :"); System.out.println( (f1 != f1));
    System.out.println("Done!");
  }
}
