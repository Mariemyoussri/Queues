package eg.edu.alexu.csd.datastructure.queue.cs77_56_91;

import java.util.NoSuchElementException;
import java.util.Scanner; 

public class main {
 
	public static void menu() {
	  System.out.println("Choose an action:");
	  System.out.println("============================================");
	  System.out.println("1-Enqueue");
	  System.out.println("2-Dequeue");
	  System.out.println("3-Get size");
	  System.out.println("4-IS empty");
      System.out.println("5-Exit");
	  System.out.println("============================================");
	}
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose implementation method:");
	System.out.println("============================================");
	System.out.println("1-Array");
	System.out.println("2-Linked List");
	System.out.println("============================================");
	boolean done=false;
	while(!done) {
	  char choice = sc.next().charAt(0);
	  switch(choice) {
	  case '1':
			done = true;
			System.out.println("Inter size:");
			int size = sc.nextInt();
			QueuesArray q = new QueuesArray(size);
			Boolean Exit = false;
			while(!Exit) {
			  menu();
			  char choice2 = sc.next().charAt(0);
			  sc.nextLine();
			  switch(choice2) {
			  case'1':
				    try {
						  System.out.println("Enter input:");
						  String element = sc.nextLine();
						  q.enqueue(element);
					    }
					    catch(NoSuchElementException e) {
					    	System.out.println("Queue is full");
					    }
				    break;
			  case'2':
				  try {
						Object value =  q.dequeue();
						System.out.println("element dequeued is: "+value);
					    }
					    catch(NoSuchElementException e) {
					    	System.out.println("Queue is empty");
					    }
				  break;
			  case'3':
				  System.out.println(q.size());
				  break;
			  case'4':
				  System.out.println(q.isEmpty());
				  break;
			  case'5':
				  Exit = true;
				  break;
			  default:
				  System.out.println("Invalid");
				  break;
			  }
            }
			break;
	  case'2':
		  done = true;
			QueuesLinkedList q1 = new QueuesLinkedList();
			Boolean Exit1 = false;
			while(!Exit1) {
			  menu();
			  char choice2 = sc.next().charAt(0);
			  sc.nextLine();
			  switch(choice2) {
			  case'1':
				  System.out.println("Enter input:");
				  String element = sc.nextLine();
				  q1.enqueue(element);
				  break;
			  case'2':
				  try {
					    Object value =  q1.dequeue();
						System.out.println("element dequeued is: "+value);
					  }
					  catch(NoSuchElementException e) {
					    System.out.println("Queue is empty");
					  }
				  break;
			  case'3':
				  System.out.println(q1.size());
				  break;
			  case'4':
				  System.out.println(q1.isEmpty());
				  break;
			  case'5':
				  Exit1 = true;
				  break;
			  default:
				  System.out.println("Invalid");
				  break;
			  }
		    }
			break;
		default:
			System.out.println("Invalid");
            break;
	} 
  }
 }
}
