public class Sorting {

  /*public static void BubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int flag = 0;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = 1;
        }
      }
      if (flag == 0) {
        System.out.print("Array has already Sorted:");
        break;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
    */

  //Selection Sort

  /*
  public static void selection_sort(int arr[]) {
    for (int i = 0; i <= arr.length - 2; i++) {
      int minpos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minpos] > arr[j]) {
          minpos = j;
        }
      }
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
    */

  //Insertion Sort

  /*
  public static void insertion_sort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      arr[prev + 1] = curr;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  */

  //Counting Sort

  public static void Counting_sort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      largest=Math.max(arr[i],largest);

    }
    int count[] =new int[largest+1];

    for(int i=0;i<arr.length;i++){
      count[arr[i]]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
      while(count[i]>0){
        arr[j]=i;
        j++;
        count[i]--;
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String args[]) {
    int arr[] = {1,4,1,3,2,4,3,7};
    //BubbleSort(arr);
    //selection_sort(arr);
    //insertion_sort(arr);
    Counting_sort(arr);
  }
}
