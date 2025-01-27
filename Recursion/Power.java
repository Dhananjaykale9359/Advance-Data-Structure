public class Power {

  public static int Calculate_power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int nm1 = Calculate_power(x, n - 1);
    int pow = x * nm1;
    return pow;
  }

  public static void main(String args[]) {
    System.out.println(Calculate_power(2, 25));
  }
}
