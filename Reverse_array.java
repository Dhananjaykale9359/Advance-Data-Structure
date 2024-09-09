public class Reverse_array {

  public static void array_reverse(int a[]) {
    int first;
    int last;
    last = a.length - 1;
    first = 0;

    while (first < last) {
      int temp = a[first];
      a[first] = a[last];
      a[last] = temp;
      first++;
      last--;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(String args[]) {
    int a[] = { 2, 4, 6, 8, 10 };
    array_reverse(a);
  }
}
