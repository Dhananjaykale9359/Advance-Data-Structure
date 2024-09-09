public class Subarray {

  public static void array(int n[]) {
    for (int i = 0; i < n.length; i++) {
      int start = i;
      for (int j = i; j < n.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(n[k]+" ");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    int n[] = { 2, 4, 6, 8, 10 };
    array(n);
  }
}
