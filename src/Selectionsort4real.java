
public class Selectionsort4real {
	
	static int[] chaos = {1,2,3,4,5,6,7,8,9};
	static int count = 0 ;	
	public static void main(String args[]){
		selectionSort(chaos);
	
	}
	
	public static void selectionSort(int[] sort){
	
		for(int i=0; i<sort.length; i++){
			
			for(int j=0; j<sort.length; j++){
				
				if(sort[j]<sort[i]){
					int speischer = sort[i];
					sort[i] = sort[j];
					sort[j] = speischer;
					count++;
					for(int k=0; k<sort.length; k++){
						System.out.print(sort[k]+" ");
						
					}					
					
					System.out.println("| Vorgang Nr.:"+count);
					
				}				
			}
		}
	}
}
