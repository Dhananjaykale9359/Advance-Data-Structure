public class Pair_array {

  public static void pair(int a[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        System.out.print("(" + a[i] + "," + a[j] + ")");
      }
      System.out.println();
    }
    //System.out.println();
  }

  public static void main(String args[]) {
    int a[] = { 2, 4, 6, 8, 10 };
    pair(a);
  }
}
