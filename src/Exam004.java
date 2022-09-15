/**
 * 
  * @FileName : Exam004.java
  * @Project : Programmers
  * @Date : 2022. 9. 15. 
  * @작성자 : GnG
  * @변경이력 : 
  * @프로그램 설명 : 하샤드 수
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
