import java.util.Arrays;

public class Exam007 {
	public static void main(String[] args) {
		// int[] arr = {5,9,7,10};
		// int divisor = 5;
		// int[] arr = {2,36,1,3};
		// int divisor = 1;
		int[] arr = { 3, 2, 6 };
		int divisor = 10;

		int[] answer = new int[arr.length];
		int arrCnt = 0;
		for (int i : arr) {
			if (i % divisor == 0) {
				// System.out.println(count);
				// System.out.println(i);
				answer[arrCnt] = i;
				arrCnt++;
			}
		}

		answer = Arrays.copyOf(answer, arrCnt);
		if (arrCnt == 0) {
			// answer = new int[1];
			// answer[0] = -1;
			answer = new int[] { -1 };
		} else {
			Arrays.sort(answer);
		}
		for (int i : answer) {
			System.out.println(i);
		}
		// return answer;
		// System.out.println(answer);
	}
}
