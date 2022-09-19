
public class Exam006 {
	public static void main(String[] args) {
		//int[] arr = {4,3,2,1};
		int[] arr = {-10};
		int[] answer = new int[arr.length-1];
        
		if(arr.length == 1) {
			answer[0] = -1;
		}else {
	        int min = arr[0];
	        for(int i=1; i<arr.length; i++){
	            if(arr[i] < min){
	                min = arr[i];
	            }
	        }
            
	        int index = 0;
	        for(int i=0; i<arr.length; i++){
	            if(min < arr[i]){
	                answer[index] = arr[i];
	                index++;
	            }
	        }
		}
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
	}
}
