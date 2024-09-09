public class Staircase {

  public static void search_element(int matrix[][], int key) {
    int row = 0;
    int col = matrix[0].length-1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col]==key) {
        System.out.print("Element Found at:(" + row + "," + col + ")");
        return;     //It exit from the function
      } 
      else if (key < matrix[row][col]) {
        col--;
      } 
      else {
        row++;
      }
    }
    System.out.println(key + "are not present in that matrix:");
  }

  public static void main(String args[]) {
    int matrix[][] = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 27, 29, 37, 48 },
      { 32, 33, 39, 50 },
    };
    int key=33;
    search_element(matrix, key);
  }
}
