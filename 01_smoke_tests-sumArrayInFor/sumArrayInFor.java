public class sumArrayInFor {

	public static void main(String[] args) {
		int n=4;
		int s,i;

		int[] v = new int[n + 1];
		for(i=0; i<=n; i++) {
			v[i] = i;
		}

		s=0;
		for(i=0; i<=n; i++) {
			s = s + v[i];
		}
		System.out.print("sum 1.."); System.out.print(n); System.out.print("="); System.out.println( s);
    System.out.println("Done!");
	}
}

// sum 1..4=10
// Done!
