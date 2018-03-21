package array_Class;

public class MultiDimentionalArray {
	public static void main(String[] args) {

		int[][] twoD = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10 } };

		System.out.println(twoD[1].length);
		System.out.println(twoD[2].getClass().isArray());
		System.out.println(twoD[1][2]);
	}
}
/**
what will it print?
A- 4 true 6
B- 3 true 3
C- 4 false 6
*/