public class weerbericht {


	//Het attribuut dat naar een array van String objecten gaat verwijzen
	
	private String [] berichten;
	
	public weerbericht() {
	
		
		//maak een array van 7 String objecten, berichten verwijst nu naar deze array
		berichten  = new String[7];
	
		//vul de berichtenarray willekeurig met 3 verschillende
		//weersomstandigheden: “zon”, “regen” en “bewolkt”
		
		//loop door de array heen
		for ( int i= 0 ; i <berichten.length; i++) 
		{
			//maak een willekeurig getal van 0 tot 3 (0, 1 en 2)
			int weer = (int) (Math.random() * 3);
			//elk getal stelt een weertype voor, en wordt in de array opgeslagen
			if (weer ==0 ) {
				
				berichten[i] = "zon";
			}
			else if( weer == 1)
			{
				
				berichten[i] = " regen";
				
				
			}
			else if ( weer == 2)
			{
				
				berichten[i] = " Bewolkt";
				
			}
			
			
		}
	}
	//methode om het weertype (als String) op te halen van een bepaalde dag
	public String getDagBericht( int dag)
	{
		
		
		return berichten[dag];
	}
}
