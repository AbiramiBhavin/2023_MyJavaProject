package day19;
import java.util.*;

public class Queue {

	public static void main(String[] args) {
		//Demonstration of Queue in a simple program conecpt is same like we standing in queue
		//LinkedList not only performs list function but also the queue function
		//thatswhy we have deckared as LinkedList in the below line for queue
		
				LinkedList<String> x= new LinkedList<String>();
				
				x.add("aaa");// add is used to add values to the Queue
				x.add("bbb");
				x.add("ccc");
				x.add("ddd");
				x.add("eee");
				x.add("fff");
				System.out.println("After adding values");
				System.out.println(x);
				System.out.println("Retriving the first value");
				//System.out.println(x.peek());// peek() is used to get first element in queue
				System.out.println(x.peekFirst());// in peek we have peekfirt and peeklast functions
				System.out.println("Retrivking the last value in quque");
				System.out.println(x.peekLast());
				
				System.out.println(x.poll());// poll removes the first element in queue and prints it
				System.out.println("After removing first value");
				System.out.println(x);
				System.out.println(x.pollFirst());
				System.out.println("After poll fisrt function");
				System.out.println(x);
				System.out.println("After removing last vale in queue");
				System.out.println(x.pollLast());
				System.out.println("Display");
				System.out.println(x);
				
				System.out.println("After removing first element using pop");
				System.out.println(x.pop());//first element in list/queue
				System.out.println(x);	
				System.out.println("After adding values using offer function");
				x.offer("aaa");// offer function is used to add values 
				System.out.println(x);
				System.out.println("After adding values in the front");
				x.offerFirst("bbb");
				System.out.println(x);
				System.out.println("After adding values in the last using offer");
				x.offerLast("ccc");
				System.out.println(x);
				
			}

		}
	