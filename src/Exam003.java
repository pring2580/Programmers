/**
 * 
  * @FileName : Exam003.java
  * @Project : Programmers
  * @Date : 2022. 9. 14. 
  * @�ۼ��� : GnG
  * @�����̷� : 
  * @���α׷� ���� : ���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
  * ���� ����
	num�� int ������ �����Դϴ�.
	0�� ¦���Դϴ�.
 */
public class Exam003 {
	public static void main(String[] args) {
		int num = 3;
		System.out.println(solution(num));
		num = 4;
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
		return (num % 2 == 0)?"Even":"Odd";
	}
}
