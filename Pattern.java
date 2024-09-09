public class Pattern {

  /*
  no=b
  public static void hollow_rectangle(int m, int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || j == 1 || j == m || i == n) {
          System.out.print("* ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  */

  /*
no = O
  public static void no_pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.err.print(i);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
*/

/*
no = p

  public static void palindromic_pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  /*
no = n
  public static void diamond_pattern(int n) {
    // first half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //Second Half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

*/
  /*
no = k
  public static void butterfly_pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
*/
  /*
no=l
  public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
*/
  /*
no=m
  public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
*/
  public static void main(String args[]) {
    //no_pattern(5);
    // palindromic_pattern(5);
    //diamond_pattern(4);
    //butterfly_pattern(5);
    //solid_rhombus(5);
    //hollow_rhombus(5);
  }
}
