package eg.edu.alexu.csd.datastructure.queue.cs77_56_91;

import java.util.NoSuchElementException;

public class QueuesLinkedList implements IQueue,ILinkedBased{
	Node header ;
	Node tail ;
	int size = 0;
	public QueuesLinkedList() {
		 header=new Node();
		 tail = header;
		 header.setNext(tail);
	}
	
	@Override
	public void enqueue(Object item) {
		Node node = new Node();
		node.setValue(item);
		node.setNext(null);
        tail.setNext(node);
        tail=node;
        size++;
	}

	@Override
	public Object dequeue() {
		if(size == 0) {
			throw new NoSuchElementException("Quque is empty");
		}
		Node temp = header.getNext();
		Object temp1 = temp.getvalue();
		header.setNext(temp.getNext());
		size--;
		if(size==0) {
			tail=header;
		}
		return temp1;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

}
