public class Exam008 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		//int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		for(int i=0; i<10; i++) {
			boolean boo = false;
			for(int j=0; j<numbers.length; j++) {
				if(i==numbers[j]) {
					boo = true;
				}
			}
			if(!boo) {
				answer += i;
			}
		}
		return answer;
	}
}
