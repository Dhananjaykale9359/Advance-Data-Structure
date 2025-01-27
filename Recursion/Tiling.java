public class Tiling {

  public static int combination(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    //combination of putting the vertical tiles having size of each tile is 2*1;
    int vertical = combination(n - 1);
    //combination of putting the vertical tiles having size of each tile is 2*1;
    int horizontal = combination(n - 2);
    // total combination
    int total = vertical + horizontal;
    return total;
  }
 
  public static void main(String args[]) {
    System.out.println(combination(3));
  }
}
