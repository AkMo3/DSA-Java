package Datastructure.List;

public class LinkedList<E> {

  Node<E> head;

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

  boolean isEmpty() {
    return (head == null);
  }

  static class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
      this.data = data;
      next = null;
    }
  }

  void print() {
    Node<E> temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void get(int n) {
    Node<E> temp = head;
    int i = 0;
    while (i < n) {
      temp = temp.next;
      i++;
    }

    System.out.println(temp.data);
  }

  void set(int a, E b) {
    Node<E> temp = head;
    int i = 0;
    while (i < a) {
      temp = temp.next;
      i++;
    }

    temp.data = b;
  }

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
