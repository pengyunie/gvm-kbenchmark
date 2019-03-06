/*
Interface fields are public.
  B < (A{protected v}, I{v})
  Test the following references:
  - (other package){B.v} - refers I.v
*/

import a.*;

public class f_access_05_interf_fields_public {

  public static void main(String[] args) {
    System.out.print("(other package){B.v}: "); System.out.println( B.v);
    System.out.println("Done!");
  }
}
