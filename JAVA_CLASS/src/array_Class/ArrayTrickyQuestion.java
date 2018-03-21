package array_Class;

public class ArrayTrickyQuestion {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println(a[(a = b)[3]]);
	}
}
/**
what will it print?
A- It will print 1.
B- It will print 3.
C- It will not compile.
D- It will throw ArrayIndexOutOfBoundsException when run
*/