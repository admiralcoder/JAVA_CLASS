package stringBuilder;

public class StringBuilderClass {

	public static void main(String[] args) {
		// Example 1
		// Empty String Builder
		StringBuilder sb = new StringBuilder();
		sb.append("Mickey");
		sb.append("Minnie");
		// Insert Rodriguez after Mickey
		sb.insert(6, " Rodriguez ");
		// Delete ey from Mickey
		sb.delete(4, 6);
		// Delete e from Minnie
		sb.deleteCharAt(20);
		System.out.println(sb.indexOf("k"));

		System.out.println(sb);

		// Print the length
		System.out.println("StringBuilder contains: " + sb.length() + " Letters");

		// String builder converts to String
		String string = sb.toString();
		System.out.println(string);
		
		//StringBuilder with a value
		StringBuilder sb1 = new StringBuilder("animals ");
		sb1.append("cat ");
		sb1.append("dog");
		System.out.println(sb1);
		
		//StringBuilder reserve numeric slots for characters
		StringBuilder sb2 = new StringBuilder(2);
		sb2.append("cow ");
		sb2.append("monkey ");
		sb2.append("ant");
		System.out.println(sb2);

		
	}

}
