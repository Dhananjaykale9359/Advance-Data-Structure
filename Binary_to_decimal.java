public class Binary_to_decimal {

  public static void bin_number(int n) {
    int original_no = n;
    int pow = 0;
    int dec = 0;
    int last;
    while (n > 0) {
      last = n % 10;
      dec = dec + (int) (last * Math.pow(2, pow));
      n = n / 10;
      pow++;
    }
    System.out.println("Decimal no of these number" + original_no + "is" + dec);
  }

  public static void main(String args[]) {
    bin_number(1010);
  }
}
