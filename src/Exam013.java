
public class Exam013 {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
            	//a :97 z:122, A:65 Z:90
                int c = s.charAt(i);
                //System.out.println(s.charAt(i) + " >> "+ c + "\t\t +"+n+">> "+(c+n));
                if((c+n) > 122) {
                	c = (c+n)-26;
                }else if(c < 91 && (c+n) > 90) {
                	c = (c+n)-26;
                }else {
                	c = (c+n);
                }
                answer += String.valueOf((char)c);
            }else{
                answer += " ";
            }
        }
        System.out.println(answer);
        //a :97 z:122, A:65 Z:90
	}
}
