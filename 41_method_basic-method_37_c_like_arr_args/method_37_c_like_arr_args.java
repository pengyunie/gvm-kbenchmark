// Method with c-like array arguments. Three such arguments.

public class method_37_c_like_arr_args {
  public static void main(String[] args) {
    new A().f(
      new int[]{1,2,3},
      new String[]{"12",null},
      new int[][]{null,null,null,{1,2}},
      new int[][]{}
    );
    System.out.println("Done!");
  }
}

class A {
  void f(int vi[], String vs[], int mi[][], int[] mi2[]) {
    System.out.print("vi.length= "); System.out.println(vi.length);
    System.out.print("vs.length= "); System.out.println(vs.length);
    System.out.print("mi.length= "); System.out.println(mi.length);
    System.out.print("mi2.length= "); System.out.println(mi2.length);
  }
}
