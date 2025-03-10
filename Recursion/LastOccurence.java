public class LastOccurence {

  public static int last_occurence(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int found = last_occurence(arr, key, i + 1);
    if (found == -1 && arr[i] == key) {
      return i;
    }
    return found;
  }

  public static void main(String args[]) {
    int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
    System.out.println(last_occurence(arr, 5, 0));
  }
}
