public class StationApp {
public static void main(String[] args) {
	//maak vier Station klassen in een array
	//geef van elk station de volgende plaatsnamen mee: Haarlem, Leiden, Utrecht en Zwolle
		Station[] stations = new Station[4] ;

		
		stations[0] = new Station(" Haarlem");
		stations[1] = new Station(" Leiden");
		stations[2] = new Station(" Utrecht");
		stations[3] = new Station(" Zwolle");
		
		//print van alle Station klassen het huidige bericht over
		//de trein naar Amsterdam m.b.v. een loop/lus
		//v.b.: station.roepOm( "Amsterdam" )
		for  (int i = 0 ; i < stations.length; i++)
		{
			
			
			System.out.println(stations[i].roepOm(" Haarlem"));
			System.out.println(stations[i].roepOm(" Leiden"));
		}
		
	}
	
}
