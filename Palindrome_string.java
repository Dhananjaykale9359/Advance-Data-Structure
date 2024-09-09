//import java.util.*;

public class Palindrome_string {

  /*

  public static boolean palindrome(String s) {
    int first = s.charAt(0);
    int last = s.charAt(s.length() - 1);

    while (first < last) {
      if (s.charAt(first) != s.charAt(last)) {
        // System.out.print("String is not Palindrome:");
        return false;
      }
      first++;
      last--;
    }
    return true;
    //System.out.println("Given string is palindrome:");
  }
  */

  //To find the largest String

  /*
  public static void largest_string(String arr[]) {
    String largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (largest.compareTo(arr[i]) < 0) {
        largest = arr[i];
      }
    }
    System.out.println("Largest string is:" + largest);
  }
  */

  //APPEND METHOD

  /*
  public static void append() {
    StringBuilder str = new StringBuilder("");
    for (char ch = 'a'; ch <= 'z'; ch++) {
      str.append(ch);
    }
    System.out.println(str);
    System.out.print(str.length());
  }

  */

  //Capitalize the first char of word
  /*
  public static void to_uppercase(String str){
    StringBuilder sb=new StringBuilder("");

    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
      if(str.charAt(i)==' '&&i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      }
      else{
        sb.append(str.charAt(i));
      }
    }
    System.out.println(sb);

  }
  */

  //Compression of String

  public static void compression(String str) {
    String new_str = "";
    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      new_str += str.charAt(i);
      if (count > 1) {
        new_str += count.toString();
      }
    }
    System.out.println(new_str);
  }

  public static void main(String args[]) {
    //String arr[] = { "apple", "banana", "mango" };
    //largest_string(arr);
    //append();
    //String str="i am kale dhananjay";
    //to_uppercase(str);
    String str = "aaaabbbccddd";
    compression(str);
  }
}
