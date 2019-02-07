public class BubbleSort {
	static int k;
	static int[] intArr = { 16, 23, 14, 7, 214, 20, 6, 1, 17, 13, 12, 9, 3, 19 }; 
	static int count = 0 ;	
	public static void main(String args[]){
		
	
	
	
	  
	         
	for (int i = intArr.length; i > 1; i--){
	    for (int j=0; j<i-1; j++){
	      if (intArr[j] > intArr[j+1]){
	    	  	   	  
	    	  k = intArr[j]; 
	            intArr[j] = intArr[j+1]; 
	            intArr[j+1] = k; 
	            output();
	       } // Ende if
	    } // Ende innere for-Schleife
	  } // Ende ‰uﬂere for-Schleife
	
	
	}

	public static void output(){
		for (int i=0; i<intArr.length;i++){
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
	}
	
}

