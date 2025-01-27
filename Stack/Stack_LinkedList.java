
public class Stack_LinkedList {

  public static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head = null;

  public static boolean isEmpty() {
    return head == null;
  }

  public static void push(int data) {
    Node new_node = new Node(data);
    if (isEmpty()) {
      head = new_node;
      return;
    }
    new_node.next = head;
    head = new_node;
  }

  // pop element from linked list

  public static int pop() {
    if (isEmpty()) {
      return -1;
    }
    int top = head.data;
    head = head.next;
    return top;
  }

  // peek Element

  public static int peek() {
    if (isEmpty()) {
      return -1;
    }
    return head.data;
  }

  public static void main(String args[]) {
    Stack_LinkedList s = new Stack_LinkedList();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    
    while (!isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
