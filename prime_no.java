public class prime_no {

  public static boolean prime(int n) {
    //int flag = 0;
    if (n == 1) {
      System.out.println("neither prime nor composite:");
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        //flag = 1;
        return false;
      }
    }
    return true;
    // if (flag == 1) {
    //   System.out.println("No is not Prime:");
    // } else {
    //   System.out.println("No is prime:");
    // }
  }

  public static void prime_range(int n) {
    if (n == 2) {
      System.out.println("2 is Prime number:");
    } else {
      for (int i = 2; i <= n; i++) {
        if (prime(i)) {
          System.out.println("prime number is:" + i);
        }
      }
    }
  }

  public static void main(String args[]) {
    //prime(4);
    prime_range(10);
  }
}
