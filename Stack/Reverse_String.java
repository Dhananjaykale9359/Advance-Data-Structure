import java.util.*;

public class Reverse_String {

  public static void reverse_string(Stack<Character> s) {
    StringBuilder result = new StringBuilder("");
    
    while (!s.isEmpty()) {
        char curr = s.pop();
        result.append(curr);


    //   System.out.println(s.pop());
    }
    result.toString();
    System.out.println(result); 
 }

  public static void main(String args[]) {
    Stack<Character> s = new Stack<>();
    String str = "abcd";
    for (int ch = 0; ch < str.length(); ch++) {
      s.push(str.charAt(ch));
    }
    reverse_string(s);
  }
}
git 