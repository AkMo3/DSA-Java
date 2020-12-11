package dataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements Iterable<E> {

  /* Driver Code*/
  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();

    st.push(2);
    st.push(3);
    st.push(4);
    st.push(8);
    System.out.println(st.pop());
    System.out.println(st.pop());

    for (int d : st) {
      System.out.println("Iterable item " + d);
    }
  }

  /**
   * {@summary Node class for creating object of node.}
   *
   * @param E Datatype of node.
   */
  @SuppressWarnings("hiding")
  class Node<E> {

    E data;

    Node<E> next;

    Node(E data) {

      this.data = data;

      next = null;
    }
  }

  Node<E> head = null;

  /**
   * Pushes data to stack.
   *
   * @param data Data that is to be added to Stack.
   */
  public void push(E data) {

    if (head == null) {

      head = new Node<E>(data);

    } else if (head != null) {

      Node<E> ToAdd = head;

      head = new Node<E>(data);

      head.next = ToAdd;
    }
  }

  /**
   * Returns last pushed element of stack.
   *
   * @return Latest element added to stack.
   */
  public E pop() {

    if (head == null) {

      throw new NullPointerException("Can't remove empty element from empty stack");
    }

    Node<E> ToRemove = head;

    head = head.next;

    return ToRemove.data;
  }

  /** Iterator method to iterate through elements in stack. */
  @Override
  public Iterator<E> iterator() {
    return (new StackIterator());
  }

  /** Iterator class for creation of main iterator method. */
  private class StackIterator implements Iterator<E> {

    private Node<E> current = head;

    /** Returns boolean if the next element is available. */
    @Override
    public boolean hasNext() {
      return current != null;
    }

    /** Returs the next element from stack. */
    @Override
    public E next() {

      if (!hasNext()) {
        throw new NoSuchElementException("No more elements");
      }

      E data = current.data;
      current = current.next;
      return data;
    }
  }
}
