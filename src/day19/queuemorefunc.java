package day19;
import java.util.*;

public class queuemorefunc {

	public static void main(String[] args) {
		
				LinkedList<String> x= new LinkedList<String>();
				//This list performs both queue and list functions thats why declared as list in above line
				
		 x.add("aaa");
				x.add("bbb");
				x.add("ccc");
				x.add("ddd");
				x.add("eee");
				x.add("fff");
				System.out.println("After adding values in queue");
				System.out.println(x);
				
				System.out.println("To get the values at index of 2");
				System.out.println(x.get(2));//ccc
				System.out.println(x);
				System.out.println("To get the first value");
				System.out.println(x.getFirst());//aaa
				System.out.println("To get the last value");
				System.out.println(x.getLast());//fff
				System.out.println("Display");
				System.out.println(x);

				System.out.println("removed first value and after removing first value");
				x.remove();
				System.out.println(x);
				System.out.println("Again after removing first value");
				x.removeFirst();//bbb
				System.out.println(x);
				System.out.println("After removing last value");
				x.removeLast();//fff;
				System.out.println(x);
				
				x.add("aaa");
				x.add("bbb");
				x.add("ccc");
				x.add("ddd");
				x.add("eee");
				x.add("fff");
				System.out.println("Again after adding");
				System.out.println(x);
				
				System.out.println("if two ccc to remove the last occurance of ccc");
				x.removeLastOccurrence("ccc");
				System.out.println(x);
				System.out.println("To remove the first occurance of ddd");
				x.removeFirstOccurrence("ddd");
				System.out.println(x);
				
				System.out.println("to get the poistion of aaa if present in queue");
				System.out.println(x.indexOf("aaa"));//2
				System.out.println("Returns -1 if the value is not present");
				System.out.println(x.indexOf("aaabbb"));//-1
				
				System.out.println("To getthe position of last index of queue");
				System.out.println(x.lastIndexOf("eee"));
				System.out.println(x.indexOf("eee"));
			}

		}


	


