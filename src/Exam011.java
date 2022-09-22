
public class Exam011 {
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
        StringBuffer sb = new StringBuffer();
        
        boolean boo = false;
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                boo = true;
            }else{
                boo = false;
                j=0;
            }
            if(boo){
                if(j%2 == 0){   //대문자
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                }else{  //소문자
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                j++;
            }else{
                sb.append(" ");
            }
            System.out.println("s.charAt("+i+") : "+s.charAt(i)+"\t\t j : "+j+"\t\tsb.toString() : "+sb.toString());
        }
        //answer = sb.toString().substring(0, sb.length());
        answer = sb.toString();
        System.out.println(answer);
	}
}
