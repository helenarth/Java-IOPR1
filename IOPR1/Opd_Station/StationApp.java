public class StationApp {

	public static void main(String[] args) {
		
		Stations[ ] station = new Stations[4] ;
		
		station[0] = "Haarlem";
		station [1 ] = "Leiden";
		station [2 ] = "Utrecht";
		station[3] = "Zwolle";
		
		
		for  (int i = 0 ; i < station.lenght; i++)
		{
			
			
			System.out.println("Haarlem" + station.roepOm());
			
		}
		
	}
	
}
