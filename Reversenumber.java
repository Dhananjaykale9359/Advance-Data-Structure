import java.util.Scanner;

class Reversenumber{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value:");
    int a = sc.nextInt();
    while(a>0)
    {
        int lastdigit = a%10;
        System.out.println("The Reverse number is:"+lastdigit);
        a=a/10;
    }
    System.out.println();
  }
}
