package Thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> mainList = new ArrayList<Integer>();
		
		for(int i = 1; i<=10000; i++) {
			mainList.add(i);
		}
		
		List<Integer> firstPiece = mainList.subList(0, 2500);
		List<Integer> secondPiece = mainList.subList(2500, 5000);
		List<Integer> thirdPiece = mainList.subList(5000, 7500);
		List<Integer> fourthPiece = mainList.subList(7500, 10000);
		
		
		
		EvenOddList c1 = new EvenOddList(firstPiece);
		
		EvenOddList c2 = new EvenOddList(secondPiece);
		
		EvenOddList c3 = new EvenOddList(thirdPiece);
		
		EvenOddList c4 = new EvenOddList(fourthPiece);		
		
		Thread t1 = new Thread(c1);
		
		Thread t2 = new Thread(c2);
		
		Thread t3 = new Thread(c3);
		
		Thread t4 = new Thread(c4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(10);
		list2.add(40);
		list2.add(20);
		list2.add(30);
	
		list2.add(50);
		
		list2.stream().limit(3).distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
	}
}
