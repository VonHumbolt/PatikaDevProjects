package Thread;

import java.util.ArrayList;
import java.util.List;

public class EvenOddList implements Runnable{

	private List<Integer> evenList;
	private List<Integer> oddList;
	
	private List<Integer> list;
	
	private Object obj = new Object();
	
	public EvenOddList(List<Integer> list) {
		this.list = list;
		this.evenList = new ArrayList<Integer>();
		this.oddList = new ArrayList<Integer>();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<this.list.size(); i++) {
			synchronized (obj) {
				
				if (this.list.get(i) % 2 == 0) {
					this.evenList.add(i);
					System.out.println(i);
				} else {
					this.oddList.add(i);
					System.out.println(i);
				}
			}
			
		}
		
		
	}


}
