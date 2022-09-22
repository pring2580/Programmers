
public class Exam014 {
	public static void main(String[] args) {
		//int n = 5;
		//int[] arr1 = {9,20,28,18,11};
		//int[] arr2 = {30,1,21,17,28};
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		
		String[] answer = new String[n];
        
        for(int i=0; i<arr1.length; i++){
            String tmp = Integer.toString(arr1[i], 2);
            String tmp2 = Integer.toString(arr2[i], 2);
            String res = "";
            while(tmp.length() < n || tmp2.length() < n) {
            	if(tmp.length() < n) {
            		tmp = "0"+tmp;
            	}
            	if(tmp2.length() < n) {
            		tmp2 = "0"+tmp2;
            	}
            }
            for(int j=0; j<tmp.length(); j++){
                if(tmp.charAt(j) == '1' || tmp2.charAt(j) == '1'){
                    res += "#";
                }else{
                    res += " ";
                }
            }
            System.out.println(res);
            answer[i] = res;
        }
        for(String str : answer) {
        	//System.out.println(str);
        }
	}
}
