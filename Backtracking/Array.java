public class Array {

  public static void changeArr(int arr[], int i, int n) {
    if (i == arr.length) {
      printArr(arr);
      return;
    }
    changeArr(arr, i + 1, n + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    changeArr(arr, 0, 1);
    printArr(arr);
  }
}
