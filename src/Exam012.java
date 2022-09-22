
public class Exam012 {
	public static void main(String[] args) {
		int n=45;
		int answer = 0;
        //String s = "";
        String s = Integer.toString(n,3);
        //System.out.println(s);
        for(int i=0; i<s.length(); i++) {
        	answer += Math.pow(3, i) * Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(answer);
        //return answer;
        //System.out.println(answer);
	}
}
