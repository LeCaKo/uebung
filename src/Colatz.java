
public class Colatz {

	public static void main(String[] args) {
		
		
		int zahl;
		
		for(int i = 1; i<=100;i++ ){
		
		zahl = i ;
		
		System.out.print("Seed:" + i+"| ");
		
		while (zahl >= 2){
		
		if(zahl % 2 != 0) {
			zahl = zahl * 3 + 1;
		}
		else {
			zahl = zahl / 2;
		}
		System.out.print(zahl + ", ");
		
		
		}
		System.out.println("");
		
	}

}
}
