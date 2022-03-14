package gt.edu.umg.progra3.colas;

import java.util.NoSuchElementException;

public class ColaImpl implements Cola{
	
	private Node head = null;
	private Node tail = null;

	@Override
	public void enqueue(String item) {
		Node newNode = new Node(item, null);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
	}

	@Override
	public String deque() {
		if (isEmpty()) {
			throw new NoSuchElementException("Cannot dequeue from empty Queue");
		}
		String item = head.item;
		if (tail == head) {
			tail = null;
		}
		head = head.next;
		return item;
	}

	@Override
	public String peek() {
		if (head == null) {
			throw new NoSuchElementException("Cannot peek from empty Queue");
		}
		return head.item;
	}

	@Override
	public int size() {
		int count = 0;
		for (Node node = head; node != null; node = node.next) {
			count++;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}
	
	class Node {
		private String item;
		private Node next;
		
		public Node(String item, Node next) {
			this.item = item;
			this.next = next;
		}
		
	}
}
