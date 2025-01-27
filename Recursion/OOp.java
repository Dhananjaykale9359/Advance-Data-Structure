public class OOP {

  class A {

    public int a = 5;
    int b = 6;

    private int c;

    public void sum() {
      c = a + b;
      System.out.print(c);
    }
  }

  class B extends A {

    public int c = 10;

    public void print() {
      System.out.println(c);
    }
  }

  public static void main(String args[]) {
    OOP p = new OOP();
    B b = p.new B();
    b.sum();
  }
}
