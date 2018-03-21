package strings_Class;

import java.util.*;

public class ListTest {
	public static void main(String args[]) {
		List s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add(1, "c");
		List s2 = new ArrayList(s1.subList(1, 1));
		s1.addAll(s2);
		System.out.println(s1);
	}
}
/*
What will it print?
A- The sequence a, b, c is printed
B- The sequence a, b, c, b is printed.
C- The sequence a, c, b, c is printed.
D- The sequence a, c, b is printed.
*/