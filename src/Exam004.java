/**
 * 
  * @FileName : Exam004.java
  * @Project : Programmers
  * @Date : 2022. 9. 15. 
  * @작성자 : GnG
  * @변경이력 : 
  * @프로그램 설명 : 하샤드 수
  * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
  * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
  * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */
public class Exam004 {
	public static void main(String[] args) {
		int x = 12345;
		boolean answer = true;
        String str = String.valueOf(x);
		//int test = Arrays.stream(str.split("")).mapToInt(Integer::new).sum();
        int test = 0;
        for(int i=0; i<str.length(); i++){
            test += str.charAt(i) - '0';
        }
        if(x % test != 0)   answer = false;
        System.out.println(answer);
	}
}
