
public class Colatz {

	public static void main(String[] args) {
		
		int zahl = 42;
				
		while (zahl >= 2){
		
		if(zahl % 2 != 0) {
			zahl = zahl * 3 + 1;
		}
		else {
			zahl = zahl / 2;
		}
		System.out.print(zahl + ", ");
		
		}
		
	}

}
