public class Decimal_to_binary {

  public static void binary(int n) {
    int original_no = n;
    int pow = 0;
    int binary = 0;
    while (n > 0) {
      int rem = n % 2;
      binary = binary + rem * (int) Math.pow(10, pow);
      pow++;
      n = n / 2;
    }
    System.out.print("Binary number of these number" + original_no + "is" + binary);
  }

  public static void main(String args[]) {
    binary(10);
  }
}
