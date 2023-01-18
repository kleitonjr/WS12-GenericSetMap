package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {

		Set<Integer> a = new LinkedHashSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new LinkedHashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new LinkedHashSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new LinkedHashSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new LinkedHashSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}
}