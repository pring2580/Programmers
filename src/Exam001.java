import java.util.ArrayList;

/**
  * @FileName : Level01.java
  * @Project : Programmers
  * @Date : 2022. 9. 14. 
  * @작성자 : GnG
  * @변경이력 : 
  * @프로그램 설명 : 2019 카카오 개발자 겨울 인턴십 크레인 인형뽑기 게임
 */
public class Exam001 {
	public static void main(String[] args) {
		int[][] a = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] b = {1,5,3,5,1,2,1,4};
		System.out.println(solution(a, b));
	}
	
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> boxList = new ArrayList<Integer>();
		for(int i=0; i<moves.length; i++){
			for(int j=0; j<board.length; j++){
				if(board[j][moves[i]-1] != 0){
					int temp = board[j][moves[i]-1];
					//같으면 2증가
					if(boxList.size() > 0 && boxList.get(boxList.size()-1) == temp){
						answer += 2;
						boxList.remove(boxList.size()-1);
					}else{
						boxList.add(temp);
					}
					board[j][moves[i]-1] = 0;   //이동한 값은 0
					break;
				}
			}
		}
		return answer;
	}
}
