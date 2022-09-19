import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Exam009 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] aStr = s.split("");
		Arrays.sort(aStr);
		for(int i=aStr.length-1; i>=0; i--) {
			answer += aStr[i];
		}
		return answer;
	}
}
