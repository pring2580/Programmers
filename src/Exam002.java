/**
 * 
  * @FileName : Exam002.java
  * @Project : Programmers
  * @Date : 2022. 9. 14. 
  * @�ۼ��� : GnG
  * @�����̷� : 
  * @���α׷� ���� : �������� 1�� �Ǵ� �� ã��
  * �ڿ��� n�� �Ű������� �־����ϴ�.
  * n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���.
  * ���� �׻� �������� ����� �� �ֽ��ϴ�.
 */
public class Exam002 {
	public static void main(String[] args) {
		int n = 10;	//3
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer = 1;
		while(n % answer != 1) {
			answer++;
		}
		return answer;
	}
}
