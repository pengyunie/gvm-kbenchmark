/*
Static field as instance counter.
  Class have one static and one instance field. Create three instances.
  Check that static field is the same, instance field is different.
*/

public class static_f_104_instance_counter {
  public static void main(String[] args) {
    A.nextId = 0;
    System.out.println(A.nextId);
    A a1 = new A();
    System.out.println(A.nextId);
    A a2 = new A();
    System.out.println(A.nextId);
    A a3 = new A();
    System.out.println(A.nextId);

    System.out.print(a1); System.out.print(" "); System.out.print(a2); System.out.print(" "); System.out.println(a3);
    System.out.println("Done!");
  }
}

class A {
  static int nextId;
  int id;

  A() {
    id = nextId;
    nextId++;
  }

  public String toString() {
    return "(id="+id+" nextId="+nextId+")";
  }
}
