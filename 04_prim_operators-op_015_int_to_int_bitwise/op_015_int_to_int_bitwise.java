public class op_015_int_to_int_bitwise {
  public static void main(String[] args) {
    new main(args);
  }
}

class main {

	void printAll(String[] vs, int[] v) {
		for (int i = 0; i<nrOps; i++) {
      System.out.print(vs[i]); System.out.print(" = "); System.out.println(v[i]);
		}
	}

  int nrOps = 10;

  String[] initVS() {
    String[] vs = new String[nrOps];
    int i=0;

		//Infix operators
		vs[i++] = "9 | 3        ";
		vs[i++] = "9 ^ 3        ";
		vs[i++] = "9 & 3        ";
		vs[i++] = "9 | -4       ";
		vs[i++] = "9 ^ -4       ";
		vs[i++] = "9 & -4       ";
		vs[i++] = "-10 | 3      ";
		vs[i++] = "-10 ^ 3      ";
		vs[i++] = "-10 & 3      ";

		//Prefix operators
		vs[i++] = "~ 9          ";

    nrOps = i;
    return vs;
  }

	main(String[] args) {
    int[] v = new int[nrOps];
    String[] vs = initVS();

    for(int i=0; i<nrOps; i++) {
      v[i] = 9;
    }

    int i=0;
		//Infix operators
		v[i++] = 9 | 3;
		v[i++] = 9 ^ 3;
		v[i++] = 9 & 3;
		v[i++] = 9 | -4;
		v[i++] = 9 ^ -4;
		v[i++] = 9 & -4;
		v[i++] = -10 | 3;
		v[i++] = -10 ^ 3;
		v[i++] = -10 & 3;

		//Prefix operators
		v[i++] = ~ 9;

    printAll(vs,v);
    System.out.println("Done!");
	}
}
