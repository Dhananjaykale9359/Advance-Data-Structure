public class Friends_pairing {

  public static int friendspairing(int n) {
    if (n == 1 || n == 2) {
      return n;
    }
    //single
    int single = friendspairing(n - 1);
    int pair = friendspairing(n - 2);
    int pair_way = (n - 1) * pair;
    int total_way = single + pair_way;
    return total_way;
  }

  public static void main(String args[]) {
    System.out.println(friendspairing(3));
  }
}
