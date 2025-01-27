public class Valid_Palindrom {

  public static boolean palindrom(String s) {
    
    StringBuilder sb = new StringBuilder();

   
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

     
      if (Character.isLetterOrDigit(ch)) {
        sb.append(Character.toLowerCase(ch));
      }
    }
    String ss = sb.toString();
    int n = ss.length();
    for (int i = 0; i < n / 2; i++) {
      if (ss.charAt(i) != ss.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(palindrom(s));
   
  }
}
