
public class LinkedListTest {

	public static void main(String[] args) {
		//Singly Linked
		SinglyLinkedList<Integer> listS = new SinglyLinkedList<>();
		//listS.addFirst(2); listS.addFirst(4); listS.addFirst(6); listS.addFirst(8); listS.addFirst(10);
		listS.addLast(2); listS.addLast(4); listS.addLast(6); listS.addLast(8); listS.addLast(10);
		listS.displayList();
		
		//Doubly Linked List
		DLinkedList<Integer> listD = new DLinkedList<>();
		listD.addLast(2); listD.addLast(4); listD.addLast(6); listD.addLast(8); listD.addLast(10);
		//listD.displayList();
	}
	
	private static class Node<E>{
		E data;
		Node<E> nextAddress = null;
		public Node(E data) {
			this.data = data;
		}
//		public Node(E data, Node<E> nextAddress) {
//			this.data = data;
//			this.nextAddress = nextAddress;
//		}
	}
	private static class DNode<E>{
		E data;
		DNode<E> nextAddress = null;
		DNode<E> prevAddress = null;
		public DNode(E data) {
			this.data = data;
		}
		public DNode(E data, DNode<E> prevAddress, DNode<E> nextAddress) {
			this.data = data;
			this.prevAddress = prevAddress;
			this.nextAddress = nextAddress;
		}
	}
	private static class SinglyLinkedList<E>{
		Node<E> head;
		Node<E> tail;
		int size;
		
		public SinglyLinkedList() {
			
		}
		public boolean isEmpty() {return this.size == 0;}
		
		public void addFirst(E element) {
			Node<E> newest = new Node<>(element);
			if(isEmpty()) {
				tail = newest;
			}
			newest.nextAddress = head;
			head = newest;
			size++;
		}
		public void addLast(E element) {
			Node<E> newest = new Node<>(element);
			if(isEmpty()) {
				head = newest;
			}else {
				tail.nextAddress = newest;
			}
			tail = newest;
			size++;
		}
		
		public void displayList() {
			Node<E> current = head;
			int n = 0;
			while(current != null && n < 7) {
				System.out.print(current.data + " ");
				current = current.nextAddress;
				n++;
			}
		}
	}

	private static class DLinkedList<E>{
		DNode<E> head;
		DNode<E> tail;
		int size;
		
		public DLinkedList() {
			this.head = new DNode<>(null, null, null);
			this.tail = new DNode<>(null, head, null);
		}
		
		public boolean isEmpty() {return this.size==0;}
		
		public void addFirst(E element) {
			addBetween(element, head, head.nextAddress);
		}
		public void addLast(E element) {
			addBetween(element, tail.prevAddress, tail);
		}
		public void addBetween(E element, DNode<E> predecessor, DNode<E> successor) {
			DNode<E> newest = new DNode<>(element, predecessor, successor);
			if(isEmpty()) {
				head.nextAddress = newest;
				tail.prevAddress = newest;
			}else {
				predecessor.nextAddress = newest;
				successor.prevAddress = newest;
			}
			size++;
		}
		
		public void displayList() {
			DNode<E> curr = head.nextAddress;
			int n = 0;
			while(curr.nextAddress != null && n < 7) {
				System.out.print(curr.data + " ");
				curr = curr.nextAddress;
				n++;
			}
		}
	}
}

/*Node<E> head;
		Node<E> tail;
		int size;
		
		public void SinglyLinkedList() {
			this.size = 0;
		}
		
		public boolean isEmpty() {return size == 0;}
		
		public void addFirst(E element) {
			Node<E> newest = new Node<>(element);
			if(isEmpty()) {
				tail = newest;
			}else {
				newest.nextAddress = head;
			}
			head = newest;
			
			size++;
		}
		
		public void addLast(E element) {
			Node<E> newest = new Node<>(element);
			if(isEmpty()) {
				head = newest;
			}else {
				tail.nextAddress = newest;
			}
			tail = newest;
			
			size++;
		}
		
		public Node<E> reverseIter(Node<E> head){
			Node<E> prev = null;
			Node<E> curr = head;
			Node<E> next;
			int n = 0;
			while(curr != null && n < 7) {
				next = curr.nextAddress;
				curr.nextAddress = prev;
				prev = curr;
				curr = next;
				
				n++;
			}
			return prev;
		}
		
		public Node<E> reverseRec(Node<E> head){
			if(head.nextAddress == null) {
				return head;
			}
			
			Node<E> current = reverseRec(head.nextAddress);
			head.nextAddress.nextAddress = head;
			head.nextAddress = null;
						
			return current;
		}
		
		public void displayList(Node<E> head) {
			int n = 0;
			while(head != null && n < 7) {
				System.out.print(head.data + " ");
				head = head.nextAddress;
				n++;
			}
			System.out.println("\nSize: " + this.size);
		}*/
