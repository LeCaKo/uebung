
public class WindstärkeROFL {

	public static void main(String[] args) {
		
		int kmh ;
		
		kmh = 10 ;
				
		System.out.println( Math.pow(kmh/3.6)/0.836,(2/3) + " Beaufort");
		
		System.out.println( kmh * 0.54 + " Knoten");
				
		if( kmh <= 2 ) {
			
			System.out.println("Windstillstand");
			
		}

		if( kmh > 2 && kmh < 100 ){
			
			System.out.print("Normalwind");
			
		}
		
		if( kmh >= 100 ){
			
			System.out.print("Orkan");
			
		}
		
	}

}
