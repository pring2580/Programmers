
public class Exam010 {
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;

		for (int i = left; i <= right; i++) {
			int cnt = 0;
			int j = 1;
			while (j <= i) {
				//System.out.println(i+" % "+j+" >> "+i%j);
				if (i % j == 0) {
					cnt++;
				}
				j++;
			}
			//System.out.println(i+"약수 개수 >> "+cnt);
			if (cnt % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
			j = 0;
			cnt = 0;
		}
		System.out.println(answer);
	}
}
