
public class weerbericht {


	// atriubten 
	private String[] berichtenarray;
	String berichten ; 
	public weerbericht() {
		
		this.berichtenarray = new String[7] ;
	
		berichten = " zon, regen, bewolkt";
		for ( int i= 0 ; i <berichtenarray.length; i++) 
		{
			
			System.out.println(" Het weer voor de volgnde week is>:");
			
			
		}
	}
	
	public String getDagBericht()
	{
		
		
		return berichten;
	}
}
