package jan4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_IntDemo {

	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(100);
		num.add(300);
		num.add(500);
		num.add(700);
		num.add(900);
		num.add(1100);
		num.add(1300);
		num.add(1500);
		// to print specific value
		System.out.println(num.get(7));
		Iterator<Integer>x=num.iterator();
		while (x.hasNext()) 
		{
		System.out.println(x.next());	
		}

	}

}
