package dataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements Iterable<E> {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(8);
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		for(int d : st) {
			System.out.println("Iterable item "+d);
		}

	}
		
		@SuppressWarnings("hiding")
		class Node<E>{
			
			E data;
			
			Node<E> next;
			
			Node(E data){
				
				this.data = data;
				
				next = null;
			}			
		}
		
		Node<E> head=null;
		
		public void push(E data) {
			
			if(head==null) {
				
				head = new Node<E>(data); 
			
			}else if(head!=null){
				
				Node<E> ToAdd = head;			
				
				head = new Node<E>(data);
				
				head.next = ToAdd;
			}			
		}
		
		public E pop() {
			
			if(head==null) {
				 
				throw new NullPointerException("Can't remove empty element from empty stack");
			}	
			
			Node<E> ToRemove = head;
			
			head = head.next;
			
			return ToRemove.data;
		}

		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return (new StackIterator());
		}
		
		private class StackIterator implements Iterator<E>{

			private Node<E> current =  head;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return current!=null;
			}

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
