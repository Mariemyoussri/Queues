package eg.edu.alexu.csd.datastructure.queue.cs77_56_91;

import java.util.NoSuchElementException;

public class QueuesArray implements IQueue,IArrayBased{

	int N ;
    int f = 0;
    int r = 0;
    Object[] queue ;
    QueuesArray(int size){
      N = size+1;
      queue = new Object[N];
    }
    
	public void enqueue(Object item) {
	 if((r+1==f)||((f==0)&&(r==N-1))) {
		 throw new NoSuchElementException("Full queue");
	 }
	 queue[r] = item;
	 r = (r+1)%N;
	}

	@Override
	public Object dequeue() {
		if(isEmpty()) {
		  throw new NoSuchElementException("Queue is empty");
		}
		Object temp = queue[f];
		queue[f] = null;
		f = (f+1)%N;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		if(f == r) {
		  return true;
		}
		return false;
	}

	@Override
	public int size() {
		return (N-f+r)%N;
	}
	
	public void print() {
	 for(int i=0;i<(N-f+r)%N;i++) {
		 System.out.println(queue[i]);
	 }
	}

}
