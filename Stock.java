public class Stock {

  public static void buy_sell(int n[]) {
    int buy_price = Integer.MAX_VALUE;
    int profit = 0;
    int max_profit = 0;
    for (int i = 0; i < n.length; i++) {
      if (buy_price < n[i]) {
        profit = n[i] - buy_price;
        max_profit = Math.max(profit, max_profit);
      } else {
        buy_price = n[i];
      }
    }
    System.out.println("Maximum profit is" + max_profit);
  }

  public static void main(String args[]) {
    int n[] = { 7, 1, 5, 3, 6, 4 };
    buy_sell(n);
  }
}
