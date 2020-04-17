package eg.edu.alexu.csd.datastructure.queue.cs77_56_91;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class QueueArrayTest {
	
	QueuesArray test = new QueuesArray(5);
	QueueArrayTest(){
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(77);
		test.enqueue(26);
		
	}
	

	@Test
	void testEnqueue() {
         test.enqueue(70);
         assertEquals(5,test.size());
      assertThrows(NoSuchElementException.class ,() -> test.enqueue(4));	

	}

@Test
void testDequeue() {
	 Object d=test.dequeue();
     assertEquals(1,d);
     assertEquals(3,test.size());	
     
 	QueuesArray test2= new QueuesArray(5);
  assertThrows(NoSuchElementException.class ,() -> test2.dequeue());	
}


@Test
void testSize() {
    test.enqueue(70);
     assertEquals(5,test.size());
     test.dequeue();
     assertEquals(4,test.size());	
  	QueuesArray test2= new QueuesArray(2);
     assertEquals(0,test2.size());	
}

@Test
void testEmpty() {
     assertEquals(false,test.isEmpty());	
  	QueuesArray test2= new QueuesArray(6);
     assertEquals(true,test2.isEmpty());	
    test2.enqueue(5);
     assertEquals(false,test2.isEmpty());	
}
}
