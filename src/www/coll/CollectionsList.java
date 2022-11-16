package www.coll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsList {
	
	public static void main(String[] args) {
		List l= new ArrayList();
		l.add(7333);
		l.add("MOM");
		l.add(8903900595l);
		l.add(546.876f);
		l.add(6789.56435d);
		l.add(123);
		System.out.println(l);
		List s = new LinkedList();
		s.addAll(l);
		s.add("sreeram");
		System.out.println(s);
		Object a = s.get(3);
		System.out.println(a);
		s.set(1, "dad");
		System.out.println(s);
		List a1 = s.subList(0, 5);
		System.out.println(a1);
		
		
	}

}
