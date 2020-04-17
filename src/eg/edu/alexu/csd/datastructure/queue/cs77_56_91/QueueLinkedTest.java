package eg.edu.alexu.csd.datastructure.queue.cs77_56_91;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class QueueLinkedTest {


		QueuesLinkedList test= new QueuesLinkedList();
		QueueLinkedTest(){
			test.enqueue(1);
			test.enqueue(2);
			test.enqueue(77);
			test.enqueue(26);
		}
		
		@Test
		void testEnqueue() {
	         test.enqueue(70);
	         assertEquals(5,test.size());
		}

	@Test
	void testDequeue() {
		 Object d=test.dequeue();
	     assertEquals(1,d);
	     assertEquals(3,test.size());	
	     
	 	QueuesLinkedList test2= new QueuesLinkedList();
	  assertThrows(NoSuchElementException.class ,() -> test2.dequeue());	
	}


	@Test
	void testSize() {
	    test.enqueue(70);
	     assertEquals(5,test.size());
	     test.dequeue();
	     assertEquals(4,test.size());	
	  	QueuesLinkedList test2= new QueuesLinkedList();
	     assertEquals(0,test2.size());	
	}

	@Test
	void testEmpty() {
	     assertEquals(false,test.isEmpty());	
	  	QueuesLinkedList test2= new QueuesLinkedList ();
	     assertEquals(true,test2.isEmpty());	
	    test2.enqueue(5);
	     assertEquals(false,test2.isEmpty());	
	}
}
