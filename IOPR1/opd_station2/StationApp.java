public class StationApp {
public static void main(String[] args) {
		
		Station[ ] stationarray = new Station[4] ;
		
		stationarray[0] = "Haarlem";
		stationarray [1 ] = "Leiden";
		stationarray [2 ] = "Utrecht";
		stationarray[3] = "Zwolle";
		
		
		for  (int i = 0 ; i < stationarray.length; i++)
		{
			
			
			System.out.println("Haarlem" + Station.roepOm());
			
		}
		
	}
	
}
