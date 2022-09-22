
public class Exam015 {
	public static void main(String[] args) {
		// int n = 1;
		// String[] strings = {"sun", "bed", "car"};
		int n = 2;
		//String[] strings = { "abce", "abcd", "cdx" };
		String[] strings = { "abcf", "abcz", "abcd", "abce", "cdx" };

		String[] answer = strings;
		for (int i = 0; i < strings.length; i++) {
			String str1 = strings[i];
			for (int j = i + 1; j < strings.length; j++) {
				String str2 = strings[j];
				if (str1.charAt(n) >= str2.charAt(n)) {
					System.out.println("str1 >> "+str1+"\t\tstr2 >> "+str2+"\t\t compareTo >> "+str1.compareTo(str2));
					if (str1.charAt(n) == str2.charAt(n)) {
						if (strings[i].compareTo(strings[j]) > -1) {
							String swap = strings[i];
							strings[i] = strings[j];
							strings[j] = swap;
						}
					}else {
						String swap = str1;
						strings[i] = str2;
						strings[j] = swap;
					}
				}
			}
		}
		answer = strings;
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
