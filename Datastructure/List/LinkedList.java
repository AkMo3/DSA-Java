package Datastructure.List;

public class LinkedList<E> {

  Node<E> head;

  /**
   * Adds data in LinkedList
   * @param data Data of node to be added
   */
  void add(E data) {
    Node<E> ToAdd = new Node<E>(data);
    Node<E> temp = head;
    if (isEmpty()) {
      head = ToAdd;
      return;
    }
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = ToAdd;
  }

  /**
   * Returns boolean is List empty
   * @return true if list empty 
   */
  boolean isEmpty() {
    return (head == null);
  }

  /**
   * Node class
   */
  static class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
      this.data = data;
      next = null;
    }
  }

  /**
   * Prints elements of list
   */
  void print() {
    Node<E> temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  /**
   * return element at nth postion in List.
   * @param n element at nth position.
   */
  E get(int n) {
  Node<E> temp = head;
  int i = 0;
  while (i < n) {
    temp = temp.next;
    i++;
  }
  return (temp.data);
  }

  /**
   * Replace data of element at nth position with b
   * @param a position to be replaced
   * @param b Data of element to be replaced with
   */
  void set(int a, E b) {
    Node<E> temp = head;
    int i = 0;
    while (i < a) {
      temp = temp.next;
      i++;
    }

    temp.data = b;
  }

  /**
   * Checks if element is present of not
   * @param a Element to check
   * @return true if element exit, else false
   */
  boolean contains(E a) {
    Node<E> temp = head;
    while (temp != null) {
      if (temp.data == a) {
        System.out.println("true");
        return true;
      }
      temp = temp.next;
    }
    System.out.println("false");
    return false;
  }

  /**
   * Removes and returns last element in List
   * @return Last element in List
   * @throws Exception
   */
  E removeLast() throws Exception {

    Node<E> temp = head;
    if (temp == null) {
      throw new Exception("Empty ");
    }
    if (temp.next == null) {
      Node<E> toremove = head;
      head = null;
      return toremove.data;
    }
    while (temp.next.next != null) {
      temp = temp.next;
    }
    Node<E> toremove = temp.next;
    temp.next = null;
    return toremove.data;
  }

  /**
   * Fetches last element from List
   * @return Last element
   * @throws Exception
   */
  E getlast() throws Exception {
    Node<E> temp = head;
    if (temp == null) {
      throw new Exception("Empty ");
    }
    while (temp.next != null) {
      temp = temp.next;
    }
    return temp.data;
  }
}
