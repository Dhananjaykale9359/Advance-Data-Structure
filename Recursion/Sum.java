public class Sum{
    public static int sumofnatural_no(int n){
        if(n==1){
            return 1;
        }
        int nm1=sumofnatural_no(n-1);
        int sum=n+nm1;
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumofnatural_no(0));

    }
}