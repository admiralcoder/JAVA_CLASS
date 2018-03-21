package array_Class;

public class ArrayTrickyQuestion2 {

	public static void main(String[] args) {
		String[] dataArr = new String[4];
		dataArr[1] = "Bill";
		dataArr[2] = "Steve";
		dataArr[3] = "Larry";
		try {
			for (String data : dataArr) {
				System.out.print(data + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
	/**
	 * what will it print?
	 * A- null Bill Steve Larry
	 * B- class java.lang.Exception Bill Steve Larry
	 * C- Bill Steve Larry null
	 * D- Bill Steve Larry class java.lang.NullPointerException
	 */
}
