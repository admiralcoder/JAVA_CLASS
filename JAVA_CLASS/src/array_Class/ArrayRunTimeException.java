package array_Class;

	public class ArrayRunTimeException {
		public void initData(String[] arr) {
			int ind = 0;
			for (String str : arr) {
				str.concat(str + " " + ind);
				ind++;
			}
		}

		public void printData(String[] arr) {
			for (String str : arr) {
				System.out.println(str);
			}
		}

		public static void main(String[] args) {
			ArrayRunTimeException ot = new ArrayRunTimeException();
			String[] arr = new String[2];
			ot.initData(arr);
			ot.printData(arr);
		}
	}

/*
 * What will it Print?
 * 
 * A- It will throw a RuntimeException at run time.
 * B- null null
 * C- 0 1
 * D- null 0 null 1
 */
