package pack.pcc;

public class Test {
  public Test() {
    System.out.println("From pack.pcc:");
    System.out.println(new A());
    System.out.println(new pack.A());
    System.out.println(new pack.pbb.A());
    System.out.println(new pack.pcc.A());
  }
}
